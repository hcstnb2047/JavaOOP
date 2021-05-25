package lesson00;

public class Swimmer implements Stroke1, Stroke2 {

	@Override
	public void crawl() {
		System.out.println("クロールで" + distance + "m泳ぎました。");

	}

	@Override
	public void breaststreke() {
		System.out.println("平泳ぎで" + distance + "m泳ぎました。");

	}

	@Override
	public void backstroke() {
		System.out.println("背泳ぎで" + distance + "m泳いでいます。");

	}

	@Override
	public void butterfly() {
		System.out.println("バタフライで" + distance + "m泳げるといいな。");

	}

	@Override
	public void dogPaddle() {
		System.out.println("犬かきで" + distance + "mは無理。");

	}

	@Override
	public void synchronizedSwimming() {
		System.out.println("シンクロで" + time + "分演技できたらすごいよね。");

	}
}
