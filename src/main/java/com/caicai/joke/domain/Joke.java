package com.caicai.joke.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author caic
 * @description
 * @see
 * @since
 */
public class Joke {

    //内容部分
    private Integer sid;
    private String text;
    private String type;//image图片 text文本 video视频
    private String thumbanil;
    private String video;
    private String images;
    private Integer up;
    private Integer down;
    private Integer forwoard;
    private Integer comment;
    private Integer uid;
    private String name;
    private String header;


    //神评论部分
    private String top_comments_content;
    private String top_comments_voiceuri;
    private Integer top_comments_uid;
    private String top_comments_name;
    private String top_comments_header;
    private Date passtime;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getThumbanil() {
        return thumbanil;
    }

    public void setThumbanil(String thumbanil) {
        this.thumbanil = thumbanil;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Integer getForwoard() {
        return forwoard;
    }

    public void setForwoard(Integer forwoard) {
        this.forwoard = forwoard;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTop_comments_content() {
        return top_comments_content;
    }

    public void setTop_comments_content(String top_comments_content) {
        this.top_comments_content = top_comments_content;
    }

    public String getTop_comments_voiceuri() {
        return top_comments_voiceuri;
    }

    public void setTop_comments_voiceuri(String top_comments_voiceuri) {
        this.top_comments_voiceuri = top_comments_voiceuri;
    }

    public Integer getTop_comments_uid() {
        return top_comments_uid;
    }

    public void setTop_comments_uid(Integer top_comments_uid) {
        this.top_comments_uid = top_comments_uid;
    }

    public String getTop_comments_name() {
        return top_comments_name;
    }

    public void setTop_comments_name(String top_comments_name) {
        this.top_comments_name = top_comments_name;
    }

    public String getTop_comments_header() {
        return top_comments_header;
    }

    public void setTop_comments_header(String top_comments_header) {
        this.top_comments_header = top_comments_header;
    }

    public Date getPasstime() {
        return passtime;
    }

    public void setPasstime(String passtime) {
        SimpleDateFormat simdate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.passtime = simdate.parse(passtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
