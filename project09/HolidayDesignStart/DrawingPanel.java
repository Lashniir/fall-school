import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel {
    public void paintComponent(Graphics g)
    {
        // clear screen
        g.setColor(Color.white);
        g.clearRect(0,0,500,500);

        {
            System.out.printf("\nHoliday Design Alexander Foiles Fall 2015%n");
            Color back = new Color(139,87,66);         //walls
            Color flor = new Color(132,132,132);       //floor and crease
            Color tree = new Color(84,139,84);         //tree
            Color base = new Color(139,71,38);         //trunk
            Color pre1 = new Color(255,0,0);           //present red
            Color pre2 = new Color(0,255,0);           //present green
            Color pre3 = new Color(0,0,255);           //present blue
            Color blak = new Color(0,0,0);             //black
            Color wucl = new Color(128,0,128);         //WU color
            Color tins = new Color(192,192,192);       //tinsel (silver)
            Color star = new Color(255,215,0);         //star (gold)
            Color whit = new Color(255,255,255);       //white

            Rectangle rWalls = new Rectangle(0,0,500,500,back);
            rWalls.draw(g);
            Rectangle rF = new Rectangle(0,425,400,75,flor);
            rF.draw(g);
            Triangle tF= new Triangle(400,425,100,75,flor);
            tF.draw(g);
            for(int k=1;k<21;k++)
            {
                Rectangle rW= new Rectangle((25*k),0,1,500,flor);
                rW.draw(g);
            }
            Triangle t1= new Triangle(350,190,-100,250,tree);
            t1.draw(g);
            Triangle t2= new Triangle(350,190,100,250,tree);
            t2.draw(g);
            Rectangle r1= new Rectangle(325,440,50,25,base);
            r1.draw(g);
            
            
            Rectangle p1 = new Rectangle(240,445,25,35,pre1);
            p1.draw(g);
            Rectangle p2 = new Rectangle(270,440,45,25,pre2);
            p2.draw(g);
            Rectangle p3 = new Rectangle(255,450,25,35,pre3);
            p3.draw(g);
            Rectangle p4 = new Rectangle(270,445,25,35,wucl);
            p4.draw(g);
            Rectangle p5 = new Rectangle(300,445,45,25,pre3);
            p5.draw(g);
            Rectangle p6 = new Rectangle(285,455,25,35,pre1);
            p6.draw(g);
            Rectangle p7 = new Rectangle(340,445,25,35,pre1);
            p7.draw(g);
            Rectangle p8 = new Rectangle(370,440,45,25,pre2);
            p8.draw(g);
            Rectangle p9 = new Rectangle(355,450,25,35,pre3);
            p9.draw(g);
            Rectangle p12 = new Rectangle(410,443,40,35,pre1);
            p12.draw(g);
            Circle p10 = new Circle(400,445,20,wucl);
            p10.draw(g);
            Rectangle p11 = new Rectangle(385,470,25,17,pre3);
            p11.draw(g);
            
            for(int k=0;k<75;k++)
            {
                Circle wuBase = new Circle(100+k,100,50,blak);
                wuBase.draw(g);
            }
            for(int k=0;k<75;k++)
            {
                Circle wuBase = new Circle(105+k,105,45,whit);
                wuBase.draw(g);
            }
            Triangle w1 = new Triangle(140,170,-10,-40,wucl);
            w1.draw(g);
            Triangle w2 = new Triangle(140,130,10,40,wucl);
            w2.draw(g);
            Triangle w3 = new Triangle(150,170,10,-25,wucl);
            w3.draw(g);
            Triangle w4 = new Triangle(150,145,-10,25,wucl);
            w4.draw(g);
            Triangle w5 = new Triangle(160,170,-10,-25,wucl);
            w5.draw(g);
            Triangle w6 = new Triangle(160,145,10,25,wucl);
            w6.draw(g);
            Triangle w7 = new Triangle(170,170,10,-40,wucl);
            w7.draw(g);
            Triangle w8 = new Triangle(170,130,-10,40,wucl);
            w8.draw(g);
            Circle u1 = new Circle(185,130,20,wucl);
            u1.draw(g);
            Circle u2 = new Circle(195,140,10,whit);
            u2.draw(g);
            Rectangle u3 = new Rectangle(185,130,40,21,whit);
            u3.draw(g);
            Rectangle u4 = new Rectangle(186,130,10,21,wucl);
            u4.draw(g);
            Rectangle u5 = new Rectangle(215,130,10,21,wucl);
            u5.draw(g);
            Rectangle e1 = new Rectangle(235,130,10,30,wucl);
            e1.draw(g);
            Circle e2 = new Circle(234,160,5,wucl);
            e2.draw(g);
            
            Triangle tSt1 = new Triangle(350,200,30,-10,star);
            Triangle tSt2 = new Triangle(350,200,-30,-10,star);
            Triangle tSt3 = new Triangle(350,180,30,10,star);
            Triangle tSt4 = new Triangle(350,180,-30,10,star);
            Triangle tSt5 = new Triangle(350,220,-10,-30,star);
            Triangle tSt6 = new Triangle(350,220,10,-30,star);
            Triangle tSt7 = new Triangle(350,160,-10,30,star);
            Triangle tSt8 = new Triangle(350,160,10,30,star);
            tSt1.draw(g);
            tSt2.draw(g);
            tSt3.draw(g);
            tSt4.draw(g);
            tSt5.draw(g);
            tSt6.draw(g);
            tSt7.draw(g);
            tSt8.draw(g);
            Rectangle rT = new Rectangle(250,430,10,10,tins);
            for (int k=0;k<46;k++)
            {
                rT.draw(g);
                rT.setX(250+k*4);
                rT.setY(430-k);
            }
            rT.setX(265);
            rT.setY(390);
            for (int k=0;k<39;k++)
            {
                rT.draw(g);
                rT.setX(265+k*4);
                rT.setY(390-k);
            }
            rT.setX(280);
            rT.setY(350);
            for (int k=0;k<32;k++)
            {
                rT.draw(g);
                rT.setX(280+k*4);
                rT.setY(350-k);
            }
            rT.setX(295);
            rT.setY(310);
            for (int k=0;k<25;k++)
            {
                rT.draw(g);
                rT.setX(295+k*4);
                rT.setY(310-k);
            }
            rT.setX(310);
            rT.setY(270);
            for (int k=0;k<18;k++)
            {
                rT.draw(g);
                rT.setX(310+k*4);
                rT.setY(270-k);
            }
            rT.setX(327);
            rT.setY(230);
            for (int k=0;k<10;k++)
            {
                rT.draw(g);
                rT.setX(327+k*4);
                rT.setY(230-k);
            }
            
            
        }
    }
}
