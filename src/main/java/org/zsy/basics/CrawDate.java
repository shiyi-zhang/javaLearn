package org.zsy.basics;

/**
 * Created by admin on 2017/3/17.
 */
public class CrawDate {
    private int id;
    private int p_id;
    private String crawTime;
    private String keyword;
    private String siteName;
    private String topicOriginUrl;
    private String topicTitle;
    private String topicContent;
    private String answerContent;


    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    private String topWriter;
    private String topicTime;
    private int brows;
    private int like;
    private int comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getCrawTime() {
        return crawTime;
    }

    public void setCrawTime(String crawTime) {
        this.crawTime = crawTime;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getTopicOriginUrl() {
        return topicOriginUrl;
    }

    public void setTopicOriginUrl(String topicOriginUrl) {
        this.topicOriginUrl = topicOriginUrl;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    public String getTopWriter() {
        return topWriter;
    }

    public void setTopWriter(String topWriter) {
        this.topWriter = topWriter;
    }


    public String getTopicTime() {
        return topicTime;
    }

    public void setTopicTime(String topicTime) {
        this.topicTime = topicTime;
    }

    public int getBrows() {
        return brows;
    }

    public void setBrows(int brows) {
        this.brows = brows;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "CrawDate{" +
                "id=" + id +
                ", p_id=" + p_id +
                ", crawTime=" + crawTime +
                ", keyword='" + keyword + '\'' +
                ", siteName='" + siteName + '\'' +
                ", topicOriginUrl='" + topicOriginUrl + '\'' +
                ", topicTitle='" + topicTitle + '\'' +
                ", topicContent='" + topicContent + '\'' +
                ", answerContent='" + answerContent + '\'' +
                ", topWriter='" + topWriter + '\'' +
                ", topicTime=" + topicTime +
                ", brows=" + brows +
                ", like=" + like +
                ", comments=" + comments +
                '}';
    }
}
