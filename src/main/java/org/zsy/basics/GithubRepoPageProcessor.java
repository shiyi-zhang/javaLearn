package org.zsy.basics;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

public class GithubRepoPageProcessor implements PageProcessor {

    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    @Override
    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
    public void process(Page page) {
        page.addTargetRequests(page.getHtml().links().regex("(https://www\\.zhihu\\.com/[\\w\\-]+/[\\w\\-]+)").all());
        // 部分二：定义如何抽取页面信息，并保存下来
        if(page.getUrl().regex("https://www\\.zhihu\\.com/question/.*").match()){
            System.out.println(page.getUrl());
            page.putField("title",page.getHtml().xpath("//title/text()").toString());
        }
//        page.putField("name", page.getHtml().xpath("//h1[@class='entry-title public']/strong/a/text()").toString());
//        if (page.getResultItems().get("name") == null) {
            //skip this page
//            page.setSkip(true);
//        }
//        page.putField("readme", page.getHtml().xpath("//div[@id='readme']/tidyText()"));

        // 部分三：从页面发现后续的url地址来抓取
//        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/[\\w\\-]+/[\\w\\-]+)").all());
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {

        Spider.create(new GithubRepoPageProcessor())
                //从"https://github.com/code4craft"开始抓
                .addUrl("https://www.zhihu.com/search?type=content&q=%E5%85%AD%E7%A5%9E")
                //开启5个线程抓取
//                .thread(5)
                .addPipeline(new ConsolePipeline()).run();
    }
}