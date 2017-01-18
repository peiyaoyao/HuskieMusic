package com.cnepay.huskie.music.api.domain.recommend;

public class Recommend {

//	private Base<Mix5> mix_9;
//	private Base<Focus> focus;
//	private Base<Mix22> mix_22;
//	private Base<ShowList> show_list;
//	private Base<Entry> entry;
//	private Scene scene;
//	private Base<Mix5> mix_5;
//	private Base<Mix5> mix_1;
//	private Base<Recsong> recsong;
//	private Base<Radio> radio;
//	private Base<NewSong> new_song;
//	private Base<Diy> diy;
//	private Base<Mix5> mod_7;
//	private Base<King> king;
	//增加mix2 周杰伦生日

	private Mix5Vo mix_9;   //原创音乐
	private FocusVo focus;  //推荐滚动图片7张
	private Mix5Vo mix_22;  //热销专辑
	private ShowListVo show_list;   //K歌滚动图片 3张
	private EntryVo entry;      //歌手，歌曲分类，电台，会员专区
	private Scene scene;    //专栏
	private Mix5Vo mix_5;   //最热MV推荐
	private Mix5Vo mix_1;   //
	private RecsongVo recsong;  //----------
	private RadioVo radio;  //乐播节目
//	private NewSongVo new_song;
	private DiyVo diy;  //歌单推荐
	private Mix5Vo mod_7;
	private KingVo king;
	
	public Recommend() {}

	public Mix5Vo getMix_9() {
		return mix_9;
	}

	public void setMix_9(Mix5Vo mix_9) {
		this.mix_9 = mix_9;
	}

	public FocusVo getFocus() {
		return focus;
	}

	public void setFocus(FocusVo focus) {
		this.focus = focus;
	}

	public Mix5Vo getMix_22() {
		return mix_22;
	}

	public void setMix_22(Mix5Vo mix_22) {
		this.mix_22 = mix_22;
	}

	public ShowListVo getShow_list() {
		return show_list;
	}

	public void setShow_list(ShowListVo show_list) {
		this.show_list = show_list;
	}

	public EntryVo getEntry() {
		return entry;
	}

	public void setEntry(EntryVo entry) {
		this.entry = entry;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public Mix5Vo getMix_5() {
		return mix_5;
	}

	public void setMix_5(Mix5Vo mix_5) {
		this.mix_5 = mix_5;
	}

	public Mix5Vo getMix_1() {
		return mix_1;
	}

	public void setMix_1(Mix5Vo mix_1) {
		this.mix_1 = mix_1;
	}

	public RecsongVo getRecsong() {
		return recsong;
	}

	public void setRecsong(RecsongVo recsong) {
		this.recsong = recsong;
	}

	public RadioVo getRadio() {
		return radio;
	}

	public void setRadio(RadioVo radio) {
		this.radio = radio;
	}

//	public NewSongVo getNew_song() {
//		return new_song;
//	}
//
//	public void setNew_song(NewSongVo new_song) {
//		this.new_song = new_song;
//	}

	public DiyVo getDiy() {
		return diy;
	}

	public void setDiy(DiyVo diy) {
		this.diy = diy;
	}

	public Mix5Vo getMod_7() {
		return mod_7;
	}

	public void setMod_7(Mix5Vo mod_7) {
		this.mod_7 = mod_7;
	}

	public KingVo getKing() {
		return king;
	}

	public void setKing(KingVo king) {
		this.king = king;
	}

}
