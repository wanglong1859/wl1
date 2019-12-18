package com.io;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import com.swetake.util.Qrcode;

public class erweima {

	public static void main(String[] args) throws Exception {
		Qrcode ewm=new Qrcode();
		int width=200;
		int height=200;
		BufferedImage hctx=new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		//创建画笔
		Graphics2D ewhb=hctx.createGraphics();
		//设置背景
		ewhb.setBackground(Color.white);
		ewhb.setColor(Color.BLACK);
		ewhb.clearRect(0, 0, width, height);
		
		//要输出的字符
		String zf="http://www.sanguosha.com";
		byte[] zjsz=zf.getBytes();
		boolean[][] ewsz=ewm.calQrcode(zjsz);
		for (int  j = 0;  j < ewsz.length;  j++) {
			for (int i = 0; i < ewsz.length; i++) {
				if (ewsz[j][i]) {
					ewhb.fillRect(j*3+2, i*3+2, 3, 3);
				}
			}
		}
		//成像
		ewhb.dispose();
		hctx.flush();
		ImageIO.write(hctx,"jpg",new File("ewm.jpg"));
		//释放资源
	}

}
