package xyz.devkey.model.info;

public class BoardInfo {

    private String division1;
    private String division2;
    private String regDt;
    private String views;
    private String regNm;
    private String thumbnail;
    private String title;
    private String contents;

    public String getDivision1() {
        return division1;
    }

    public void setDivision1(String division1) {
        this.division1 = division1;
    }

    public String getDivision2() {
        return division2;
    }

    public void setDivision2(String division2) {
        this.division2 = division2;
    }

    public String getRegDt() {
        return regDt;
    }

    public void setRegDt(String regDt) {
        this.regDt = regDt;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getRegNm() {
        return regNm;
    }

    public void setRegNm(String regNm) {
        this.regNm = regNm;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "BoardInfo{" +
                "division1='" + division1 + '\'' +
                ", division2='" + division2 + '\'' +
                ", regDt='" + regDt + '\'' +
                ", views='" + views + '\'' +
                ", regNm='" + regNm + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
