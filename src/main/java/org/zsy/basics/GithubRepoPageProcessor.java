package org.zsy.basics;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GithubRepoPageProcessor implements PageProcessor {
    private static String keyword="";
    private static String siteName = "知乎";

    @Override
    public void process(Page page) {
//        if (page.getResultItems().get("name") == null) {
//            page.setSkip(true);
//        }
        //page.putField("html", page.getHtml());
        if (null != page.getHtml().$("#error").toString()) {
//            page.putField("imgUrl", "https://www.zhihu.com/question" + page.getHtml().xpath("//form").css("img", "src").toString());
            System.out.println("--------------------");
            System.out.println("系统限制");
            System.out.println("--------------------");

            page.setSkip(true);
        }else{
            if(page.getUrl().regex("(https://www\\.zhihu\\.com/search?(\\w+))").match()){
                List<String> allUrl = page.getHtml().xpath("//title").css("a","href").all();
                page.addTargetRequests(allUrl);
            }else {
                if (page.getUrl().regex("(https://www\\.zhihu\\.com/question/-?[1-9]\\d*$)").match()) {
                    List<String> allUrl =page.getHtml().regex("//div[@class='zh-summary']").css("a","src").all();
                    page.addTargetRequests(allUrl);
                }
                if(page.getUrl().regex("(https://www\\.zhihu\\.com/question/(\\w+)/(\\w+)/-?[1-9]\\d*$)").match()){
                    CrawDate craw=new CrawDate();
                    craw.setCrawTime(System.currentTimeMillis()+"");
                    craw.setKeyword(keyword);
                    craw.setSiteName(siteName);
                    craw.setTopicOriginUrl(page.getUrl().toString());
                    craw.setTopicTitle(page.getHtml().xpath("//div[@id='zh-question-title']").css("a","text").toString());
                    craw.setTopicContent(page.getHtml().xpath("//div[@id='zh-question-detail']/div/text()").toString());
                    craw.setTopWriter(page.getHtml().xpath("//div[@class='answer-head']").css("a.author-link","text").toString());
                    craw.setAnswerContent(page.getHtml().xpath("//div[@class='zm-editable-content clearfix']/text()").toString());
                    craw.setTopicTime(page.getHtml().xpath("//a[@class='answer-date-link meta-item'][@href='"+page.getUrl()+"']/text()").toString());
                    page.putField("craw", craw);
                }
            }

        }
        //page.putField("html", page.getHtml());
    }

    @Override
    public Site getSite() {
        return Site.me()
                .setRetryTimes(3)
                .setSleepTime(1000)
                .addHeader("User-Agent",
                        getUserAgent())
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
                .addHeader("Accept-Encoding", "gzip, deflate, sdch").addHeader("Accept-Language", "zh-CN,zh;q=0.8")
                .addHeader("Connection", "keep-alive").addHeader("Referer", "http://www.imooc.com/");
    }

    private static String getUserAgent() {
        List<String> userAgent = new ArrayList<String>();
        //模拟Opera浏览器
        userAgent.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.102 Safari/537.36 OPR");
        //模拟Safari浏览器
        userAgent.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/534.57.2 (KHTML, like Gecko) Version/5.1.7 Safari");
        //模拟Chrome浏览器
        userAgent.add("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.117 Safari");
        //模拟IE
        userAgent.add("Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident");
        //模拟Firefox浏览器
        userAgent.add("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:51.0) Gecko/20100101 Firefox/51.0");

        Random random = new Random();
        int nextInt = random.nextInt(5);
        return userAgent.get(nextInt);
    }

    public static void main(String[] args) throws Exception {

         keyword = "六神";

        Spider.create(new GithubRepoPageProcessor())
//                .addUrl("https://www.zhihu.com/question/21110894/answer/29187641")
                .addUrl("https://www.zhihu.com/search?type=content&q=" + URLEncoder.encode(keyword, "utf-8").toString())
                //.thread(2)
                .addPipeline(new ColPipeline()).run();
    }

}