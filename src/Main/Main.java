package Main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.Color;
import utils.imageSetter;
import utils.removeImage;

public class Main extends JFrame {
	private JPanel contentPane;
	private final JLabel lblBoard = new JLabel("New label");
	private JLabel lblDimage;
	private JLabel lblP1;
	private JButton btnDice;
	private JLabel lblPlayerName;
	public static JLabel lbl91;
	public static JLabel lbl92;
	public static JLabel lbl93;
	public static JLabel lbl94;
	public static JLabel lbl95;
	public static JLabel lbl96;
	public static JLabel lbl97;
	public static JLabel lbl98;
	public static JLabel lbl100;
	public static JLabel lbl99;
	public static JLabel lbl90;
	public static JLabel lbl89;
	public static JLabel lbl88;
	public static JLabel lbl87;
	public static JLabel lbl86;
	public static JLabel lbl85;
	public static JLabel lbl84;
	public static JLabel lbl83;
	public static JLabel lbl81;
	public static JLabel lbl82;
	public static JLabel lbl71;
	public static JLabel lbl72;
	public static JLabel lbl73;
	public static JLabel lbl74;
	public static JLabel lbl75;
	public static JLabel lbl76;
	public static JLabel lbl77;
	public static JLabel lbl78;
	public static JLabel lbl80;
	public static JLabel lbl79;
	public static JLabel lbl70;
	public static JLabel lbl69;
	public static JLabel lbl68;
	public static JLabel lbl67;
	public static JLabel lbl66;
	public static JLabel lbl65;
	public static JLabel lbl64;
	public static JLabel lbl63;
	public static JLabel lbl61;
	public static JLabel lbl62;
	public static JLabel lbl51;
	public static JLabel lbl52;
	public static JLabel lbl53;
	public static JLabel lbl54;
	public static JLabel lbl55;
	public static JLabel lbl56;
	public static JLabel lbl57;
	public static JLabel lbl58;
	public static JLabel lbl60;
	public static JLabel lbl59;
	public static JLabel lbl50;
	public static JLabel lbl49;
	public static JLabel lbl48;
	public static JLabel lbl47;
	public static JLabel lbl46;
	public static JLabel lbl45;
	public static JLabel lbl44;
	public static JLabel lbl43;
	public static JLabel lbl41;
	public static JLabel lbl42;
	public static JLabel lbl31;
	public static JLabel lbl32;
	public static JLabel lbl33;
	public static JLabel lbl34;
	public static JLabel lbl35;
	public static JLabel lbl36;
	public static JLabel lbl37;
	public static JLabel lbl38;
	public static JLabel lbl40;
	public static JLabel lbl39;
	public static JLabel lbl30;
	public static JLabel lbl29;
	public static JLabel lbl28;
	public static JLabel lbl27;
	public static JLabel lbl26;
	public static JLabel lbl25;
	public static JLabel lbl24;
	public static JLabel lbl23;
	public static JLabel lbl21;
	public static JLabel lbl22;
	public static JLabel lbl11;
	public static JLabel lbl12;
	public static JLabel lbl13;
	public static JLabel lbl14;
	public static JLabel lbl15;
	public static JLabel lbl16;
	public static JLabel lbl17;
	public static JLabel lbl18;
	public static JLabel lbl20;
	public static JLabel lbl19;
	public static JLabel lbl10;
	public static JLabel lbl9;
	public static JLabel lbl8;
	public static JLabel lbl7;
	public static JLabel lbl6;
	public static JLabel lbl5;
	public static JLabel lbl4;
	public static JLabel lbl3;
	public static JLabel lbl2;
	public static JLabel lbl1 = new JLabel("samik");
	private JLabel p1score;
	private JLabel lblP2;
	private JLabel p2score;
	private JButton btnRestart;
    private int flag1=0,winingPosition=0;





	private int player=1;    // running player er index.
	private int[] flag= new int[6];   // flag 1 hoile khela shuru korbe prottek player
	//private int[] location= new int[2];  // 2jon player er location thakbe.
	public int[] playerposition= new int[4]; //4jon player er position
	private int oldposition;   //player er ager position. karon amk ager position ta muche dite hobe
	private int point, score=0, f=0;
	private JLabel lblP3;
	private JLabel p3score;
	private JLabel lblP4;
	private JLabel p4score;
	private JLabel lblPlayer;
	private JLabel p1btn;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private int playerNo;
	private int chokkarAaagerPosition=0,chokka=0;
	/**
	 * Launch the application.
	 */



	public static void main(String[] args) {                    //ekhane dhukar drkr nai :/

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/**
	 * Create the frame.
	 */



	//point ta Random number create kore return kore. and dice er pic show kore
	public void Dice(){
		Random rn = new Random();

		point = rn.nextInt(6)+1;
		//point=chokkaTest();

		String dice = String.valueOf(point);
		String location = "/Image/dice "+dice+".jpg";
		lblDimage.setIcon(new ImageIcon(Main.class.getResource(location)));   //player er disk board e boshay

		if(point==1) flag[player-1]=1;      //gutir chal 1 hoile she khela shuru korte parbe
		if(flag[player-1]==1)movedisc();
		//System.out.println("Dice: "+dice);
		
	}
	

	/* 	public void Paint(int x, int y){
		//System.out.println("Paint from: "+x+" to "+y);
		new Thread() {
	        @Override
	        public void run() {
	            try {
	            	btnDice.setEnabled(false);
	            	btnDice.setVisible(false);
	            	Thread.sleep(500);
	            	for(int i=x; i<y; i++){
	            		//System.out.println("Paint Player after: "+p);
	            		RemoveImage(i);
	            		Thread.sleep(50);
		            	SetImage(i+1,player);
		                Thread.sleep(500);
	            	}
	            	btnDice.setVisible(true);
	            	btnDice.setEnabled(true);
	            } catch (InterruptedException ex) {
	                Thread.currentThread().interrupt();
	                JOptionPane.showMessageDialog(null, "Paint timer error!");
	            }

	        }
	    }.start();
	    
	    
	   ActionListener taskPerformer = new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	                

	        }
	    };
	    javax.swing.Timer t = new javax.swing.Timer(1000, taskPerformer);
	    t.setRepeats(false);
	    t.start();
	}
	*/
	



	   //disc move korate ei function
	public void movedisc(){
		//oldposition = playerposition[player-1];
		
		//----------------chokka uthle count baraitesi ar na uthle count 0---------//
		if(point==6)chokka++;
        else chokka=0;
		
		if(chokka>0)
		chokkarAaagerPosition=playerposition[player-1];
		//---------------------------------------//
		
		if(playerposition[player-1]+point >100){   //player er position 100er beshi hoile ager jaygay e thakbe//
			playerposition[player-1]= playerposition[player-1] ;
		}
		
		
		//------------3bar chokka uthle ager ghore pathaye dibe-------------//
		else if(chokka==3){
			playerposition[player-1]=chokkarAaagerPosition;
		}
		//---------------------------------//
		
		
		else{
			//Paint(playerposition[player-1],playerposition[player-1]+point);
			removeImage rimage = new removeImage();
		rimage.RemoveImage(playerposition[player-1],labels);    //she ekhon notun position e jabe. ager ghor thaikka ore bair kore deye hocche  :(
		playerposition[player-1]+=point;              //tar ager position er sathe chal e asha man jog kortese
		//RemoveImage(oldposition);

		imageSetter.SetImage(playerposition[player-1], player, labels);      //jei jei player tar tar position e boshacche, chal e man pawar por

			
			SkipTest(playerposition[player-1]);    //shap e katse kina ba moi baia upore uthse kina dekhtese


		if(playerposition[player-1] != Skipper(playerposition[player-1])){     //jodi shap e kate ba moi paia jay tahole amader ja koroniyo
			rimage.RemoveImage(playerposition[player-1],labels);
			playerposition[player-1]=Skipper(playerposition[player-1]);
			imageSetter.SetImage(playerposition[player-1], player, labels);
		}  
        
		//-------win check//
		if(playerposition[player-1]==100) winingPosition++;
		
		if(playerposition[player-1] ==100 && flag1==0){   //
			JOptionPane.showMessageDialog(null, "Player "+player+" won!!");
			flag1=1;
		}
		//--------//
		
		if(player==1){
			
			
			 if(playerposition[player-1]==100 && winingPosition==4) p1score.setText("Looser HaHA ");
			 else if(playerposition[player-1]==100) p1score.setText("Winner "+winingPosition);
			else p1score.setText(String.valueOf(playerposition[player-1]));	    //churi korte jate na psros tai score show koira ditese
		}
		
//		else if(player==2){
			else {

			 if(playerposition[player-1]==100 && winingPosition==4) p2score.setText("Looser HaHA! ");
			 else if(playerposition[player-1]==100) p2score.setText("Winner "+winingPosition);
			else 
			p2score.setText(String.valueOf(playerposition[player-1]));	 	//score show
		
			
		}
//		else if(player==3){
//
//			 if (playerposition[player-1]==100 && winingPosition==4) p3score.setText("Looser HaHA ");
//			 else if(playerposition[player-1]==100) p3score.setText("Winner "+winingPosition);
//				else
//				p3score.setText(String.valueOf(playerposition[player-1]));	 	//score show
//
//
//		}
//		else if(player==4){
//
//			 if (playerposition[player-1]==100 && winingPosition==4) p4score.setText("Looser HaHA ");
//			 else if(playerposition[player-1]==100) p4score.setText("Winner "+winingPosition);
//				else
//				p4score.setText(String.valueOf(playerposition[player-1]));	 	//score show
//		}
		}

	}
	
	




	public void PositionCheck(int x){         //dhor dui jon ek ghor e gese.. ek jon bair hoia jawar shomoy jate arekjon na bair hoia jaite pare

		for(int i=0; i<2; i++){ /// changed from 4 to 2;
			if(playerposition[i] == x && playerposition[i] != 0 && player != i+1){
				imageSetter.SetImage(x, i+1, labels);
				JOptionPane.showMessageDialog(null	, "Player matched with player "+String.valueOf(i+1));
			}
		}
		//JOptionPane.showMessageDialog(null, "position check ok");

	}






	public Main() {
		setTitle("Snake and Ladder");          //constructor
		FrameinMiddle();

        initialize();


	}




	/*
	 * Checks if a certain block has ladder or snake
	 */
	public void SkipTest(int score){              ///jOptionpane e show korbe shap katse kina ba moi paise kina
		if(score == 23 || score == 32  || score == 61  || score == 65 || score == 75 ){
			System.out.println("Ladder at "+score);
			JOptionPane.showMessageDialog(null, "Climbed Ladder at "+String.valueOf(score));
		}
		else if(score == 21  ||score == 27 ||  score == 47 || score == 56  ||score == 74  || score == 90  || score == 99 ){
			System.out.println("Snake at "+score);
			JOptionPane.showMessageDialog(null, "Eaten by Snake at "+String.valueOf(score));
		}
	}




	/*
	 * shap katle ba moi paile onno ghore jabe oi fucntion
	 */
	public int Skipper(int score){
		if(score == 21)
			return 2;
		else if(score == 27)
			return 15;
		else if(score == 23)
			return 42;
		else if(score == 32)
			return 51;

		else if(score == 47)
			return 29;
		else if(score == 56)
			return 37;
		else if(score == 61)
			return 79;
		else if(score == 65)
			return 84;
		else if(score == 74)
			return 46;
		else if(score == 90)
			return 52;
		else if(score == 75)
			return 96;
		else if(score == 99)
			return 41;

		else
			return score;

	}






	 // kono ghor thaikka image remove korar jonne eita








	// setImage


	public static void playStaticSound() {
		try {
			// Load the sound file
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
					Main.class.getResourceAsStream("/Image/dice-roll-sound.wav")); // Replace with your sound file path

			// Create a Clip to play the sound
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);

			// Add a listener to stop the clip when it finishes playing
			clip.addLineListener(new LineListener() {
				public void update(LineEvent event) {
					if (event.getType() == LineEvent.Type.STOP) {
						event.getLine().close();
					}
				}
			});

			// Start playing the sound
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public JLabel[] labels;
	@SuppressWarnings("serial")
	public void initialize(){    //game board er label, ghorer label and other label gula shob initialize kortesi

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl1 = new JLabel("");
		lbl1.setBounds(92, 576, 60, 60);
		contentPane.add(lbl1);

		 lbl2 = new JLabel("");
		lbl2.setBounds(151, 576, 60, 60);
		contentPane.add(lbl2);

		 lbl3 = new JLabel("");
		lbl3.setBounds(211, 576, 60, 60);
		contentPane.add(lbl3);

		 lbl4 = new JLabel("");
		lbl4.setBounds(271, 576, 60, 60);
		contentPane.add(lbl4);

		 lbl5 = new JLabel("");
		lbl5.setBounds(331, 576, 60, 60);
		contentPane.add(lbl5);

		 lbl6 = new JLabel("");
		lbl6.setBounds(393, 576, 60, 60);
		contentPane.add(lbl6);

		 lbl7 = new JLabel("");
		lbl7.setBounds(453, 576, 60, 60);
		contentPane.add(lbl7);

		 lbl8 = new JLabel("");
		lbl8.setBounds(511, 576, 60, 60);
		contentPane.add(lbl8);

		 lbl9 = new JLabel("");
		lbl9.setBounds(572, 576, 60, 60);
		contentPane.add(lbl9);

		 lbl10 = new JLabel("");
		lbl10.setBounds(630, 576, 60, 60);
		contentPane.add(lbl10);

		 lbl19 = new JLabel("");
		lbl19.setBounds(151, 517, 60, 60);
		contentPane.add(lbl19);

		 lbl20 = new JLabel("");
		lbl20.setBounds(92, 517, 60, 60);
		contentPane.add(lbl20);

		 lbl18 = new JLabel("");
		lbl18.setBounds(211, 517, 60, 60);
		contentPane.add(lbl18);

		 lbl17 = new JLabel("");
		lbl17.setBounds(271, 517, 60, 60);
		contentPane.add(lbl17);

		 lbl16 = new JLabel("");
		lbl16.setBounds(331, 517, 60, 60);
		contentPane.add(lbl16);

		 lbl15 = new JLabel("");
		lbl15.setBounds(393, 517, 60, 60);
		contentPane.add(lbl15);

		 lbl14 = new JLabel("");
		lbl14.setBounds(453, 517, 60, 60);
		contentPane.add(lbl14);

		 lbl13 = new JLabel("");
		lbl13.setBounds(511, 517, 60, 60);
		contentPane.add(lbl13);

		 lbl12 = new JLabel("");
		lbl12.setBounds(572, 517, 60, 60);
		contentPane.add(lbl12);

		 lbl11 = new JLabel("");
		lbl11.setBounds(630, 517, 60, 60);
		contentPane.add(lbl11);

		 lbl22 = new JLabel("");
		lbl22.setBounds(151, 457, 60, 60);
		contentPane.add(lbl22);

		 lbl21 = new JLabel("");
		lbl21.setBounds(92, 457, 60, 60);
		contentPane.add(lbl21);

		 lbl23 = new JLabel("");
		lbl23.setBounds(211, 457, 60, 60);
		contentPane.add(lbl23);

		 lbl24 = new JLabel("");
		lbl24.setBounds(271, 457, 60, 60);
		contentPane.add(lbl24);

		 lbl25 = new JLabel("");
		lbl25.setBounds(331, 457, 60, 60);
		contentPane.add(lbl25);

		 lbl26 = new JLabel("");
		lbl26.setBounds(393, 457, 60, 60);
		contentPane.add(lbl26);

		 lbl27 = new JLabel("");
		lbl27.setBounds(453, 457, 60, 60);
		contentPane.add(lbl27);

		 lbl28 = new JLabel("");
		lbl28.setBounds(511, 457, 60, 60);
		contentPane.add(lbl28);

		 lbl29 = new JLabel("");
		lbl29.setBounds(572, 457, 60, 60);
		contentPane.add(lbl29);

		 lbl30 = new JLabel("");
		lbl30.setBounds(630, 457, 60, 60);
		contentPane.add(lbl30);

		 lbl39 = new JLabel("");
		lbl39.setBounds(151, 396, 60, 60);
		contentPane.add(lbl39);

		 lbl40 = new JLabel("");
		lbl40.setBounds(92, 396, 60, 60);
		contentPane.add(lbl40);

		 lbl38 = new JLabel("");
		lbl38.setBounds(211, 396, 60, 60);
		contentPane.add(lbl38);

		 lbl37 = new JLabel("");
		lbl37.setBounds(271, 396, 60, 60);
		contentPane.add(lbl37);

		 lbl36 = new JLabel("");
		lbl36.setBounds(331, 396, 60, 60);
		contentPane.add(lbl36);

		 lbl35 = new JLabel("");
		lbl35.setBounds(393, 396, 60, 60);
		contentPane.add(lbl35);

		 lbl34 = new JLabel("");
		lbl34.setBounds(453, 396, 60, 60);
		contentPane.add(lbl34);

		 lbl33 = new JLabel("");
		lbl33.setBounds(511, 396, 60, 60);
		contentPane.add(lbl33);

		 lbl32 = new JLabel("");
		lbl32.setBounds(572, 396, 60, 60);
		contentPane.add(lbl32);

		 lbl31 = new JLabel("");
		lbl31.setBounds(630, 396, 60, 60);
		contentPane.add(lbl31);

		 lbl42 = new JLabel("");
		lbl42.setBounds(151, 335, 60, 60);
		contentPane.add(lbl42);

		 lbl41 = new JLabel("");
		lbl41.setBounds(92, 335, 60, 60);
		contentPane.add(lbl41);

		 lbl43 = new JLabel("");
		lbl43.setBounds(211, 335, 60, 60);
		contentPane.add(lbl43);

		 lbl44 = new JLabel("");
		lbl44.setBounds(271, 335, 60, 60);
		contentPane.add(lbl44);

		 lbl45 = new JLabel("");
		lbl45.setBounds(331, 335, 60, 60);
		contentPane.add(lbl45);

		 lbl46 = new JLabel("");
		lbl46.setBounds(393, 335, 60, 60);
		contentPane.add(lbl46);

		 lbl47 = new JLabel("");
		lbl47.setBounds(453, 335, 60, 60);
		contentPane.add(lbl47);

         lbl48 = new JLabel("");
		lbl48.setBounds(511, 335, 60, 60);
		contentPane.add(lbl48);

		 lbl49 = new JLabel("");
		lbl49.setBounds(572, 335, 60, 60);
		contentPane.add(lbl49);

		 lbl50 = new JLabel("");
		lbl50.setBounds(630, 335, 60, 60);
		contentPane.add(lbl50);

		 lbl59 = new JLabel("");
		lbl59.setBounds(151, 277, 60, 60);
		contentPane.add(lbl59);

		 lbl60 = new JLabel("");
		lbl60.setBounds(92, 277, 60, 60);
		contentPane.add(lbl60);

		 lbl58 = new JLabel("");
		lbl58.setBounds(211, 277, 60, 60);
		contentPane.add(lbl58);

		 lbl57 = new JLabel("");
		lbl57.setBounds(271, 277, 60, 60);
		contentPane.add(lbl57);

		 lbl56 = new JLabel("");
		lbl56.setBounds(331, 277, 60, 60);
		contentPane.add(lbl56);

		 lbl55 = new JLabel("");
		lbl55.setBounds(393, 277, 60, 60);
		contentPane.add(lbl55);

		 lbl54 = new JLabel("");
		lbl54.setBounds(453, 277, 60, 60);
		contentPane.add(lbl54);

		 lbl53 = new JLabel("");
		lbl53.setBounds(511, 277, 60, 60);
		contentPane.add(lbl53);

		 lbl52 = new JLabel("");
		lbl52.setBounds(572, 277, 60, 60);
		contentPane.add(lbl52);

		 lbl51 = new JLabel("");
		lbl51.setBounds(630, 277, 60, 60);
		contentPane.add(lbl51);

		 lbl62 = new JLabel("");
		lbl62.setBounds(151, 217, 60, 60);
		contentPane.add(lbl62);

		 lbl61 = new JLabel("");
		lbl61.setBounds(92, 217, 60, 60);
		contentPane.add(lbl61);

		 lbl63 = new JLabel("");
		lbl63.setBounds(211, 217, 60, 60);
		contentPane.add(lbl63);

		 lbl64 = new JLabel("");
		lbl64.setBounds(271, 217, 60, 60);
		contentPane.add(lbl64);

		 lbl65 = new JLabel("");
		lbl65.setBounds(331, 217, 60, 60);
		contentPane.add(lbl65);

		 lbl66 = new JLabel("");
		lbl66.setBounds(393, 217, 60, 60);
		contentPane.add(lbl66);

		 lbl67 = new JLabel("");
		lbl67.setBounds(453, 217, 60, 60);
		contentPane.add(lbl67);

		 lbl68 = new JLabel("");
		lbl68.setBounds(511, 217, 60, 60);
		contentPane.add(lbl68);

		 lbl69 = new JLabel("");
		lbl69.setBounds(572, 217, 60, 60);
		contentPane.add(lbl69);

		 lbl70 = new JLabel("");
		lbl70.setBounds(630, 217, 60, 60);
		contentPane.add(lbl70);

		 lbl79 = new JLabel("");
		lbl79.setBounds(151, 157, 60, 60);
		contentPane.add(lbl79);

		 lbl80 = new JLabel("");
		lbl80.setBounds(92, 157, 60, 60);
		contentPane.add(lbl80);

		 lbl78 = new JLabel("");
		lbl78.setBounds(211, 157, 60, 60);
		contentPane.add(lbl78);

		 lbl77 = new JLabel("");
		lbl77.setBounds(271, 157, 60, 60);
		contentPane.add(lbl77);

		 lbl76 = new JLabel("");
		lbl76.setBounds(341, 157, 50, 60);
		contentPane.add(lbl76);

		 lbl75 = new JLabel("");
		lbl75.setBounds(393, 157, 60, 60);
		contentPane.add(lbl75);

		 lbl74 = new JLabel("");
		lbl74.setBounds(453, 157, 60, 60);
		contentPane.add(lbl74);

		 lbl73 = new JLabel("");
		lbl73.setBounds(511, 157, 60, 60);
		contentPane.add(lbl73);

		 lbl72 = new JLabel("");
		lbl72.setBounds(572, 157, 60, 60);
		contentPane.add(lbl72);

		 lbl71 = new JLabel("");
		lbl71.setBounds(630, 157, 60, 60);
		contentPane.add(lbl71);

		 lbl82 = new JLabel("");
		lbl82.setBounds(151, 97, 60, 60);
		contentPane.add(lbl82);

		 lbl81 = new JLabel("");
		lbl81.setBounds(92, 97, 60, 60);
		contentPane.add(lbl81);

		 lbl83 = new JLabel("");
		lbl83.setBounds(211, 97, 60, 60);
		contentPane.add(lbl83);

		 lbl84 = new JLabel("");
		lbl84.setBounds(271, 97, 60, 60);
		contentPane.add(lbl84);

		 lbl85 = new JLabel("");
		lbl85.setBounds(331, 97, 60, 60);
		contentPane.add(lbl85);

		 lbl86 = new JLabel("");
		lbl86.setBounds(393, 97, 60, 60);
		contentPane.add(lbl86);

		 lbl87 = new JLabel("");
		lbl87.setBounds(453, 97, 60, 60);
		contentPane.add(lbl87);

		 lbl88 = new JLabel("");
		lbl88.setBounds(511, 97, 60, 60);
		contentPane.add(lbl88);

		 lbl89 = new JLabel("");
		lbl89.setBounds(572, 97, 60, 60);
		contentPane.add(lbl89);

		 lbl90 = new JLabel("");
		lbl90.setBounds(630, 97, 60, 60);
		contentPane.add(lbl90);

		 lbl99 = new JLabel("");
		lbl99.setBounds(151, 38, 60, 60);
		contentPane.add(lbl99);

		 lbl100 = new JLabel("");
		lbl100.setBounds(92, 38, 60, 60);
		contentPane.add(lbl100);

		 lbl98 = new JLabel("");
		lbl98.setBounds(211, 38, 60, 60);
		contentPane.add(lbl98);

		 lbl97 = new JLabel("");
		lbl97.setBounds(271, 38, 60, 60);
		contentPane.add(lbl97);

		 lbl96 = new JLabel("");
		lbl96.setBounds(331, 38, 60, 60);
		contentPane.add(lbl96);

		 lbl95 = new JLabel("");
		lbl95.setBounds(393, 38, 60, 60);
		contentPane.add(lbl95);

		 lbl94 = new JLabel("");
		lbl94.setBounds(453, 38, 60, 60);
		contentPane.add(lbl94);

		 lbl93 = new JLabel("");
		lbl93.setBounds(511, 38, 60, 60);
		contentPane.add(lbl93);

		 lbl92 = new JLabel("");
		lbl92.setBounds(572, 38, 60, 60);
		contentPane.add(lbl92);

		 lbl91 = new JLabel("");
		lbl91.setBounds(630, 38, 60, 60);
		contentPane.add(lbl91);

		labels = new JLabel[]{
				lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10,
				lbl11, lbl12, lbl13, lbl14, lbl15, lbl16, lbl17, lbl18, lbl19, lbl20,
				lbl21, lbl22, lbl23, lbl24, lbl25, lbl26, lbl27, lbl28, lbl29, lbl30,
				lbl31, lbl32, lbl33, lbl34, lbl35, lbl36, lbl37, lbl38, lbl39, lbl40,
				lbl41, lbl42, lbl43, lbl44, lbl45, lbl46, lbl47, lbl48, lbl49, lbl50,
				lbl51, lbl52, lbl53, lbl54, lbl55, lbl56, lbl57, lbl58, lbl59, lbl60,
				lbl61, lbl62, lbl63, lbl64, lbl65, lbl66, lbl67, lbl68, lbl69, lbl70,
				lbl71, lbl72, lbl73, lbl74, lbl75, lbl76, lbl77, lbl78, lbl79, lbl80,
				lbl81, lbl82, lbl83, lbl84, lbl85, lbl86, lbl87, lbl88, lbl89, lbl90,
				lbl91, lbl92, lbl93, lbl94, lbl95, lbl96, lbl97, lbl98, lbl99, lbl100
		};

		 lblPlayerName = new JLabel("Playing Player -");
		 lblPlayerName.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		 lblPlayerName.setForeground(new Color(51, 204, 204));
		lblPlayerName.setBounds(724, 67, 200, 26);
		contentPane.add(lblPlayerName);

		 btnDice = new JButton("Roll Dice");
		 btnDice.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		 btnDice.setForeground(new Color(255, 255, 255));
		 btnDice.setBackground(new Color(0, 0, 51));
		 btnDice.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		btnDice.setBackground(new Color(0, 0, 0));
				playStaticSound();
		 		if(chokka==0){
		 		if(winingPosition==4){
		 			int confirm = JOptionPane.showConfirmDialog(null, "Replay?", "", JOptionPane.YES_NO_OPTION);
					if(confirm == JOptionPane.YES_OPTION){
						dispose();
						Main frame = new Main();
						frame.setVisible(true);
					}
					else{
						setVisible(false); //you can't see me!
						dispose(); //Destroy the JFrame object
						
					}
		 		}
		 		
		 		//--------current player number show-------//
		 		if(player==2)lblPlayer.setText(String.valueOf(1)); // changed
		 		else lblPlayer.setText(String.valueOf(2));
		 		
		 		//---------------------------------------------//
		 		}
		 		Dice();                           //dice method call kortesi
		 		if(chokka==0)
		 		{
		 			player++;                    //1jon dice click korlo... then arekjon dice click korbe
		 		    if(player==3)player=1; // changed from 5 to 3;
		 		}// karon amr game e 4jon player taai.. :/ :/

		 	}
		 });
		 btnDice.setBackground(new Color(0, 0, 51));
		btnDice.setBounds(724, 122, 150, 44);
		contentPane.add(btnDice);


		//nicher ongshotukur kaj enter button chaplei jate  button kaj kore taai..
		contentPane.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "EXIT");
                contentPane.getRootPane().getActionMap().put("EXIT", new AbstractAction(){
                public void actionPerformed(ActionEvent e)
                	{
                		btnDice.doClick();
                	}
                });


		lblP1 = new JLabel("Player1-");
		lblP1.setForeground(new Color(0, 204, 255));
		lblP1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblP1.setBounds(718, 323, 100, 26);
		contentPane.add(lblP1);

		lblDimage = new JLabel(".");
		lblDimage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDimage.setBounds(724, 176, 132, 129);
		contentPane.add(lblDimage);

        p1score = new JLabel("Score");
        p1score.setHorizontalAlignment(SwingConstants.LEFT);
        p1score.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        p1score.setForeground(new Color(255, 255, 255));
        p1score.setBounds(790, 329, 84, 14);
        contentPane.add(p1score);

        lblP2 = new JLabel("Player2-");
        lblP2.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblP2.setForeground(new Color(255, 204, 0));
        lblP2.setBounds(718, 389, 100, 14);
        contentPane.add(lblP2);

        p2score = new JLabel("Score");
        p2score.setHorizontalAlignment(SwingConstants.LEFT);
        p2score.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        p2score.setForeground(new Color(255, 255, 255));
        p2score.setBounds(790, 389, 84, 14);
        contentPane.add(p2score);
        lblBoard.setBounds(92, 38, 600, 600);
        contentPane.add(lblBoard);



        lblBoard.setIcon(new ImageIcon(Main.class.getResource("/Image/Board Small 600 600.png")));

//        lblP3 = new JLabel("Player3-");
//        lblP3.setFont(new Font("Tahoma", Font.BOLD, 16));
//        lblP3.setForeground(new Color(255, 51, 102));
//        lblP3.setBounds(718, 437, 69, 26);
//        contentPane.add(lblP3);
//
//        p3score = new JLabel("Score");
//        p3score.setHorizontalAlignment(SwingConstants.LEFT);
//        p3score.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
//        p3score.setForeground(new Color(255, 255, 255));
//        p3score.setBounds(790, 443, 84, 14);
//        contentPane.add(p3score);

//        lblP4 = new JLabel("Player4-");
//        lblP4.setForeground(new Color(204, 51, 204));
//        lblP4.setFont(new Font("Tahoma", Font.BOLD, 16));
//        lblP4.setHorizontalAlignment(SwingConstants.CENTER);
//        lblP4.setBounds(718, 499, 69, 14);
//        contentPane.add(lblP4);
//
//        p4score = new JLabel("Score");
//        p4score.setHorizontalAlignment(SwingConstants.LEFT);
//        p4score.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
//        p4score.setForeground(new Color(255, 255, 255));
//        p4score.setBounds(790, 499, 84, 14);
//        contentPane.add(p4score);

        lblPlayer = new JLabel("1");
        lblPlayer.setHorizontalAlignment(SwingConstants.LEFT);
        lblPlayer.setForeground(new Color(255, 0, 0));
        lblPlayer.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblPlayer.setBounds(858, 67, 62, 26);
        contentPane.add(lblPlayer);

        p1btn = new JLabel("");
        p1btn.setIcon(new ImageIcon(Main.class.getResource("/Image/player 1.png")));
        p1btn.setBounds(884, 312, 50, 50);
        contentPane.add(p1btn);

        label = new JLabel("");
        label.setIcon(new ImageIcon(Main.class.getResource("/Image/player 2.png")));
        label.setBounds(884, 367, 50, 50);
        contentPane.add(label);

//        label_1 = new JLabel("");
//        label_1.setIcon(new ImageIcon(Main.Main.class.getResource("/Image/player 3.png")));
//        label_1.setBounds(884, 429, 50, 50);
//        contentPane.add(label_1);
//
//        label_2 = new JLabel("");
//        label_2.setIcon(new ImageIcon(Main.Main.class.getResource("/Image/player 4.png")));
//        label_2.setBounds(884, 490, 50, 50);
//        contentPane.add(label_2);



        btnRestart = new JButton("Restart??");
        btnRestart.setBackground(new Color(255, 255, 255));
        btnRestart.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnRestart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int confirm = JOptionPane.showConfirmDialog(null, "Do you want to Restart?", "Restart!!!", JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION){
					dispose();
					Main frame = new Main();
					frame.setVisible(true);
				}
        	}
        });
        btnRestart.setBounds(734, 576, 150, 60);
        contentPane.add(btnRestart);





        for(int i=0;i<2;i++){ // changed from 4 t0 2;
        	playerposition[i]=0;
        }
	}

	
	public void FrameinMiddle() {

		Dimension screenSize,frameSize;
		int x,y;
		screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		frameSize=getSize();
		x=(screenSize.width-frameSize.width)/2;
		y=(screenSize.height-frameSize.height)/2;
		setLocation(x, y);
		}
	

	//sesh.. muri khan alu khan:/ :/


}
