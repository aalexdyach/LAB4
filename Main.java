package com.company;

public class Main {

    public static void main(String[] args) {
	Everyone everyone = new Everyone();
	Tunnel tunnel = new Tunnel();
	Znayka znayka = new Znayka();
	Realtraveller traveller = new Realtraveller();
	Ice ice = new Ice();
	Rope rope = new Rope();
	Klepka klepka = new Klepka();
	Alpenstok alpenstok = new Alpenstok();
	This tthis = new This();

	Moon moon = new Moon();
	moon.understand(Pronouns.THESE, znayka.getName(), " понял", klepka.getName());
	moon.come(klepka.getName(), Place.IN);

	try{
		System.out.print(" не обратил никакого внимания на");
		klepka.notice(Pronouns.THIS);
		znayka.see(Time.JUST, Time.ATTIME, znayka.getName(), Place.ASIDE);
	}catch(DidNotNoticeException e){
		System.err.print(e.getMessage());
		System.err.print(" обратил внимание на этот приказ");
	}

	Object.Boot boot = new Object.Boot();
	boot.threw("сапог");
	Ponchik ponchik = new Ponchik();
	ponchik.threw(ponchik.getName());
	Moon.Cave cave = new Moon.Cave();
	cave.run(cave.getName(), Place.IN);
	Object object = new Object();
	znayka.understand(znayka.getName(), Time.ATONCE, object.getName(), Time.SOON);
	boot.knew(boot.getName());
	klepka.snatch(Place.HERE, klepka.getName(), znayka.getName(), boot.getName());
	alpenstok.fasten(alpenstok.getName());

	AbleToRock head = new AbleToRock(){
		public void rock(String who, Pronouns Enum, String where) {
			System.out.print(who);
			Enum.getNoun();
			System.out.println(name + "ой покачал, глядя на" + where + " дурачество.");
		}
	};
	head.rock(znayka.getName(), Pronouns.ONLY, tthis.getName());

	traveller.were(Time.SOON, traveller.getName(), cave.getName());

	everyone.move(everyone.getName(), Place.FURTHER);
	tunnel.come(Time.SOON, tunnel.getName());
	tunnel.notice(tunnel.getName(), Place.UNDER);
	znayka.order(znayka.getName(), traveller.getName(), "велел", Place.NONE);
	rope.link(rope.getName());
	ice.go(ice.getName());
	ice.make(Time.INTIME);
	tthis.was(tthis.getName(), Time.INTIME);
	rope.fix(Place.BELTS, rope.getName());
	klepka.slip(klepka.getName(), Place.INFRONT);
	ice.ice();
	klepka.fall(Place.DOWN, Place.NONE);
	rope.stretch(rope.getName(), Time.IMMEDIATELY);
	traveller.pull(traveller.getName());
	everyone.stress(everyone.getName());
	alpenstok.stress(alpenstok.getName(), ice.getName());
	tthis.stop(tthis.getName());
	klepka.allow(rope.getName(), klepka.getName());
	znayka.order(znayka.getName(), " ", " распорядился", Place.BEHIND);
	znayka.climb(everyone.getName(), Place.INFRONT);

	tunnel.become(Time.SOOON, tunnel.getName());
	znayka.scary(znayka.getName());
	moon.doess();
	Rope.End end = new Rope.End();
	end.order(rope.getName());
	Steklyashkin steklyashkin = new Steklyashkin();
	steklyashkin.order(steklyashkin.getName(), Place.DOWN);
	Austronaut austronaut = new Austronaut();
	austronaut.stand();
	tunnel.stand(Pronouns.GRADUALL, rope.getName());
	steklyashkin.tell(Pronouns.HIS, Place.ABOVE);
		try {
			steklyashkin.live(Time.LONG, Time.ATLAST, Time.IN, "послышался");
		} catch (VoiceException e) {
			System.err.print("не послышался его голос:");
		}
	}

}
