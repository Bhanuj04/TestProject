package Jax;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

class Ums{
	void um() {
		
		try {
			JAXBContext jc = JAXBContext.newInstance(new Class[] {playerConfigurations.class});
			Unmarshaller ums = jc.createUnmarshaller();
		playerConfigurations plc = ((playerConfigurations) ums.unmarshal(new File("/home/bhanujarya/Downloads//entertainment.xml")));
		//System.out.println(plc);
	

		//	System.out.println(plc.getPlayerConfig());
		
		//System.out.println(plc.getPlayCon().getPlayer());
		List<player> pl = plc.getPlayCon().getPlayer();
//		List<Integer> pll = new ArrayList<Integer>();

if(plc.getPlayCon().getHotelId().equals("1")) {
	System.out.println("hello");
}
		
		
		
		System.out.println("Player details ");
	   //int arr[] = new int[17];  //declaring array of size 17.
		//int i:pl.size()
//		for(Object i:pl.toArray()) {
//
//			System.out.println("Type " + pl.get((int) i).getType());
//			System.out.println("Type " + pl.get(i).getType());
////			System.out.println("Driver id "+pl.get(i).getDriverId());
////			System.out.println("Ip address "+pl.get(i).getConnection().getIp());
////			System.out.println("Port address " + pl.get(i).getConnection().getPort());
////			System.out.println("   ");
//		}
		for(int i=0;i<pl.size();i++) {
			System.out.println("Player details" + " "+ (i+1) );
			
			
		System.out.println("Type " + pl.get(i).getType());
		System.out.println("Driver id "+pl.get(i).getDriverId());
		System.out.println("Ip address "+pl.get(i).getConnection().getIp());
		System.out.println("Port address " + pl.get(i).getConnection().getPort());
		System.out.println("   ");
	 
		script ty = pl.get(pl.size()).getScripts().getScript().get(0);
		if(ty.getType().equals("start")) {
			System.out.println(ty.getParams());
		}
		}
//     script ty = pl.get(i).getScripts().getScript().get(0);
//		
//		if(ty.getType().equals("start")) {
//			System.out.println(ty.getParams());
//		}
//	
//		pl.g
//		
		 
//		for(int j=0;j<pl.size();j++) {
//			List<script> sc = pl.get(j).getScripts().getScript();
//			for(int l=0;l<sc.size();l++) {
//			script ty = pl.get(j).getScripts().getScript().get(l);
//			
//			
//			if(ty.getType().equals("start")) {
//				System.out.println(ty.getParams());
//			}
//			}
//		}
//		scripts sc = pl.get(0).getScripts();
//		System.out.println(sc.getScript().get(0).getParams());
//		//2
//		scripts scr = pl.get(2).getScripts();
//		System.out.println(sc.getScript().get(0).getParams());
	
		
//		script ty = pl.get().getScripts().getScript().get(0);
//		
//		if(ty.getType().equals("start")) {
//			System.out.println(ty.getParams());
//		}
		
		
		
		
//		int k =pl.size();
//		int h =pl.get(k).getScripts().getScript().size();
		
//		for(int i=0;i<k;k++) {
//			for(int i=0;i<pl.get(k).getScripts().getScript().size();i++)
//		if(pl.get(k).getScripts().getScript().get(i)))
//		
		
		
//		
//		
////	System.out.println(pl.get(1).getType());
////		System.out.println(pl.get(1).getDriverId());
//		
//		System.out.println("player details-2");
//		
//		System.out.println(pl.get(2).getType());
//		System.out.println(pl.get(2).getDriverId());
//		
//		System.out.println("player details-3");
//		System.out.println(pl.get(3).getType());
//		System.out.println(pl.get(3).getDriverId());
//		
//		System.out.println("player details-4");
//		
//		System.out.println(pl.get(4).getType());
//		System.out.println(pl.get(4).getDriverId());
//		
//		System.out.println("player details-5");
//		System.out.println(pl.get(5).getType());
//		System.out.println(pl.get(5).getDriverId());
//		System.out.println("player details-6");
//		
//		System.out.println(pl.get(6).getType());
//		System.out.println(pl.get(6).getDriverId());
//		
//	System.out.println("player details-7");
//		
//		System.out.println(pl.get(7).getType());
//		System.out.println(pl.get(7).getDriverId());
//		
//	System.out.println("player details-8");
//		
//		System.out.println(pl.get(8).getType());
//		System.out.println(pl.get(8).getDriverId());
//	System.out.println("player details-9");
//		
//		System.out.println(pl.get(9).getType());
//		System.out.println(pl.get(9).getDriverId());
//		
//	System.out.println("player details-10");
//		
//		System.out.println(pl.get(10).getType());
//		System.out.println(pl.get(10).getDriverId());
//		
//	System.out.println("player details-11");
//		
//		System.out.println(pl.get(11).getType());
//		System.out.println(pl.get(11).getDriverId());
//		
//	System.out.println("player details-12");
//		
//		System.out.println(pl.get(12).getType());
//		System.out.println(pl.get(12).getDriverId());
//		
//	System.out.println("player details-13");
//		
//		System.out.println(pl.get(13).getType());
//		System.out.println(pl.get(13).getDriverId());
//		
//		
//System.out.println("player details-14");
//		
//		System.out.println(pl.get(14).getType());
//		System.out.println(pl.get(14).getDriverId());
//		
//System.out.println("player details-15");
//		
//		System.out.println(pl.get(15).getType());
//		System.out.println(pl.get(15).getDriverId());
//		
//System.out.println("player details-16");
//		
//		System.out.println(pl.get(16).getType());
//		System.out.println(pl.get(16).getDriverId());
//		
//		
//		System.out.println("Ip port for player 1");
//		
//		System.out.println(pl.get(1).getConnection().getIp());
//		scripts scr = pl.get(1).getScripts();
		
		//System.out.println(scr.getScript().get(0).getParams());
		
		
		
			
//			playerConfig pc =  plc.getPlayCon();
//			System.out.println(pc.getDisplayDeviceId());
//			
//			System.out.println(pc.getRoomNumber());
//			
//			System.out.println(pc.getPlayer().get(0).getVodSecurityServerIp());
//			
//			System.out.println(pc.getPlayer().get(0).getConnection().getPort());
//			
//			System.out.println(pc.getPlayer().get(0).getScripts());
//			
//			scripts sc = pc.getPlayer().get(0).getScripts();
//			System.out.println(sc.getScript().get(1).getParams().get(0));
//			
			
//			System.out.println(pc.get(0).getPlayer());
//			System.out.println(pc.get(0).getDvcId());
//			System.out.println(pc.get(0).getRoomNumber());
//			
//			System.out.println(pc.get(0).getPlayer().get(1).getChannelListFetchUrl());
//			System.out.println(pc.get(0).getPlayer().get(1).getDefaultPswd());
//			System.out.println(pc.get(0).getPlayer().get(0).getCnn().getIp());
//			System.out.println(pc.get(0).getPlayer().get(0).getDriverId());
//			System.out.println(pc.get(0).getPlayer().get(0).getCnn().getPort());
//			System.out.println(pc.get(0).getPlayer().get(0).getScr().getScript().get(1));
//			
		
		//	System.out.println(pc.get(0).getPlayer().get(0).getScr();
//		
		
////			ArrayList arr = new ArrayList<>();
////			arr.add("Idr");
			
			
		
//				System.out.println(pc.getPlayer());
////				player pl = (player) pc.getPlayer();
////				System.out.println(pl);
//				
				
		
		
			
			
//			pl.getChannelListFetchUrl();
//			System.out.println(pl.getChannelListFetchUrl());
		//	System.out.println(plc.getClass());
			//System.out.println(player.class);
			
//			playerConfig o = new playerConfig();
//			System.out.println(o.getPlayer());
		//	ums.unmarshal(new File("/home/bhanujarya/Downloads//entertainment.xml"
//			playerConfig ob = ((playerConfig));
//			System.out.println(ob.getPlayer());
			
//		for(int i=0;i<14;i++) {
//			//System.out.println("player details-");
//			
//			System.out.println(pl.get(i).getType());
//			System.out.println(pl.get(i).getDriverId());
//		}
		
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e);
		}
		
	}
}
public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ums obj = new Ums();
		obj.um();
	
////		playerConfigurations ob = new playerConfigurations();
////		ob.setPlayerConfig(null);
//		System.out.println(ob.getPlayerConfig());
//		playerConfig objj = new playerConfig();
//		System.out.println(objj.getDisplayDeviceId());
	}

}
