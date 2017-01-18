package com.cnepay.huskie.music.api.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/1/18 0018.
 */
public class RemmendArtist {

    /**
     * error_code : 22000
     * result : {"list":[{"ting_uid":"1086","artist_id":"105","name":"90d16e90","firstchar":"Z","gender":"0","area":"0","country":"4e2d56fd","avatar_big":"http://musicdata.baidu.com/data2/pic/f76da711cb7a92501415586cead29060/246710072/246710072.jpg","avatar_middle":"http://musicdata.baidu.com/data2/pic/98c9de129f76391c2695dd0decb1108e/246710079/246710079.jpg","avatar_smal":"http://musicdata.baidu.com/data2/pic/9f7abbcee1aa3c29980ac049eacf9704/246710107/246710107.jpg","avatar_mini":"http://musicdata.baidu.com/data2/pic/4623919523d1be8fe86332854b0282c8/246710109/246710109.jpg","albums_total":"18","songs_total":"163","piao_id":"0"},{"ting_uid":"1342","artist_id":"623","name":"9ed19f99","firstchar":"H","gender":"0","area":"0","country":"4e2d56fd","avatar_big":"http://musicdata.baidu.com/data2/pic/106099233/106099233.jpg","avatar_middle":"http://musicdata.baidu.com/data2/pic/106099292/106099292.jpg","avatar_smal":"http://c.hiphotos.baidu.com/ting/abpic/item/e7cd7b899e510fb314298b99db33c895d1430c8f.jpg","avatar_mini":"http://b.hiphotos.baidu.com/ting/pic/item/1ad5ad6eddc451da8f20f1e5b4fd5266d11632ed.jpg","albums_total":"29","songs_total":"220","piao_id":"0"}]}
     */

    private int error_code;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * ting_uid : 1086
             * artist_id : 105
             * name : 90d16e90
             * firstchar : Z
             * gender : 0
             * area : 0
             * country : 4e2d56fd
             * avatar_big : http://musicdata.baidu.com/data2/pic/f76da711cb7a92501415586cead29060/246710072/246710072.jpg
             * avatar_middle : http://musicdata.baidu.com/data2/pic/98c9de129f76391c2695dd0decb1108e/246710079/246710079.jpg
             * avatar_smal : http://musicdata.baidu.com/data2/pic/9f7abbcee1aa3c29980ac049eacf9704/246710107/246710107.jpg
             * avatar_mini : http://musicdata.baidu.com/data2/pic/4623919523d1be8fe86332854b0282c8/246710109/246710109.jpg
             * albums_total : 18
             * songs_total : 163
             * piao_id : 0
             */

            private String ting_uid;
            private String artist_id;
            private String name;
            private String firstchar;
            private String gender;
            private String area;
            private String country;
            private String avatar_big;
            private String avatar_middle;
            private String avatar_smal;
            private String avatar_mini;
            private String albums_total;
            private String songs_total;
            private String piao_id;

            public String getTing_uid() {
                return ting_uid;
            }

            public void setTing_uid(String ting_uid) {
                this.ting_uid = ting_uid;
            }

            public String getArtist_id() {
                return artist_id;
            }

            public void setArtist_id(String artist_id) {
                this.artist_id = artist_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFirstchar() {
                return firstchar;
            }

            public void setFirstchar(String firstchar) {
                this.firstchar = firstchar;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getAvatar_big() {
                return avatar_big;
            }

            public void setAvatar_big(String avatar_big) {
                this.avatar_big = avatar_big;
            }

            public String getAvatar_middle() {
                return avatar_middle;
            }

            public void setAvatar_middle(String avatar_middle) {
                this.avatar_middle = avatar_middle;
            }

            public String getAvatar_smal() {
                return avatar_smal;
            }

            public void setAvatar_smal(String avatar_smal) {
                this.avatar_smal = avatar_smal;
            }

            public String getAvatar_mini() {
                return avatar_mini;
            }

            public void setAvatar_mini(String avatar_mini) {
                this.avatar_mini = avatar_mini;
            }

            public String getAlbums_total() {
                return albums_total;
            }

            public void setAlbums_total(String albums_total) {
                this.albums_total = albums_total;
            }

            public String getSongs_total() {
                return songs_total;
            }

            public void setSongs_total(String songs_total) {
                this.songs_total = songs_total;
            }

            public String getPiao_id() {
                return piao_id;
            }

            public void setPiao_id(String piao_id) {
                this.piao_id = piao_id;
            }
        }
    }
}
