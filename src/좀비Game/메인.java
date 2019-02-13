package 좀비Game;
import java.util.Random;
import java.util.Scanner;

public class 메인 {

	public static void main(String[] args) {
		
/*
	   String[] 인벤토리 = new String[20];
	   인벤토리[0] = "노루의 뿔";
	   인벤토리[1] = "사슴고기";
	   인벤토리[2] = "뱀의독";
	   인벤토리[3] = "멧돼지의_송곳니";
	   */
	    	인벤토리 inven = new 인벤토리();
		쓰레드_로딩중 로딩중 = new 쓰레드_로딩중();
		파일럿 P = new 파일럿("파일럿",100,30,40,0,0);
		// HP,Attack,Speed,Skill
		
		좀비 Z = new 좀비("남성좀비",100,25,30,40,40);
		좀비 G = new 좀비("여성좀비",80,15,60,30,0);

		좀비 T = new 좀비("탱커",300,35,30,50,50);
		보스좀비명령 W = new 보스좀비("위치",200,30,40,45, 40,"할퀴기","덮치기");
		

		//아이템 =================================

		아이템 사슴고기 = new 아이템("사슴고기",40,100);
		아이템 노루의_뿔 = new 아이템("노루의_뿔",0,0);
		아이템 돼지고기 = new 아이템("돼지고기",0,0);
		아이템 뱀독  =new 아이템 ("뱀독",0,0);
		
		//동물=================================
	     
		동물종류 사슴 = new 동물종류("사슴",40,8,20,사슴고기,0); // 이름,,HP,공격력,스피드,아이템,아이템능력치
		동물종류 노루 = new 동물종류("노루",60,10,20,노루의_뿔,0);
		동물종류 멧돼지 = new 동물종류("멧돼지",60,15,20,돼지고기,40);
		동물종류 뱀 = new 동물종류("뱀",20,20,65,뱀독,10);
		
		//음악 ==============================
		
	   new 텍스트_제목();
	   	
	/*   musicplayer 스토리 = new musicplayer();
	   스토리.musicplayer1();
		new Intro1(); 
		스토리.intro1Music.close();    
		musicplayer 전투기 = new musicplayer();
		전투기.musicplayer2();
 	    new 전투기이동(); 	    
 	    전투기.intro2Music.close(); */
 	    
 	   Scanner scanner = new Scanner(System.in);
 	   
 	    System.out.println();
 	    System.out.println("파일럿1 : 목표지점 도착 까지 약 5분 남았습니다. Enter...");
		scanner.nextLine();
		musicplayer 폭발 = new musicplayer();
		폭발.musicplayer3();
		System.out.println( "Warning ! Warning ! Warning ! Warning ! Warning ! Warning ! Warning !");
		scanner.nextLine();
		System.out.println(" ====== !! 전투기가 날아오는 바위에 맞아 추락합니다!! ====== ");
		System.out.println();
		System.out.println( "Warning ! Warning ! Warning ! Warning ! Warning ! Warning ! Warning !");
		폭발.intro3Music.close();

		scanner.nextLine();
		System.out.println(" 파일럿 : 이런.. 젠장!! 이런 곳에 죽을 수는 없어!");
		scanner.nextLine();
		System.out.println(" 파일럿 : 으어어어아 떨어진다!!"); 

		// 낙하산 부분
		System.out.println();
		System.out.println("랜덤 값으로 낙하산의 기능 여부를 판단합니다.");
		//로딩중.run(); 
		int 낙하산 = new Random().nextInt(1);	
		

		scanner.nextLine();
		if (낙하산 == 0) {
			System.out.println("========================");
			System.out.println("안정적으로 낙하산을 폈습니다.");
			P.HP();
			System.out.println("========================");
		}

		if (낙하산 == 1) {
			System.out.println("===============================");
			P.HP = P.HP - 30;
			System.out.println(">>>>>>>> 데미지 - 30 <<<<<<<");
			System.out.println();
			P.HP();
			System.out.println("===============================");
		}
		musicplayer 대화 = new musicplayer();
		대화.musicplayer4();
		System.out.println();
		System.out.println("니우에섬에 착지하였지만 나무와의 충돌로 인하여 기절상태에 빠진다..");
		scanner.nextLine();
		System.out.println();
		System.out.println("==============+파일럿의 무기+================");
		무기 권총 = new 무기(20);
		System.out.println();
		System.out.println("파일럿의 정보를 확인하시겠습니까?");
		System.out.println("1.Yes 2.NO");

		int b = scanner.nextInt();
		scanner.nextLine();

		if (b == 1) {
			P.information();
		}
		new Intro2();
		대화.intro4Music.close();
		System.out.println();
		System.out.println("남성좀비가 나타났습니다.");
		
		if(Z.HP > 0) {
			
			musicplayer 싸우기 = new musicplayer();
			싸우기.musicplayer6();
			musicplayer 배틀 = new musicplayer();
			배틀.musicplayer7();
		

		while(P.HP > 0 && Z.HP > 0) {
			// 파일럿이랑 좀비가 살아있는 한 계속 반복한다.
			// 좀비를 만나서 싸우는 부분
			System.out.println("==============================================================================");
			System.out.println("||                                                                          || ");
			System.out.println("||  1.싸운다 | 2.도망친다 | 3.남성좀비의 정보를 확인한다. | 4. 무기 확인하기  | 5.인벤토리  || ");
			System.out.println("||                                                                          || "); 
			System.out.println("==============================================================================");

			int i1 = scanner.nextInt();

			if( i1 == 1) {	

				musicplayer 권총소리 = new musicplayer();
				권총소리.musicplayer5();
				System.out.println("-------남성좀비와의 전투를 시작합니다 -----");				
				System.out.println();					    
				System.out.println("파일럿이 좀비를 공격합니다.");

				new 무기(20);		    
				권총.총알 -= 1; 
				System.out.println("총알개수: "+ 권총.총알);

				System.out.println();
				권총소리.intro5Music.close();
				if (권총.총알 < 0) {
					권총.총알 = 0;
				}

				boolean damaged = Z.be_damaged(P.Attack);

				if (Z.HP < 0) {
					Z.HP = 0;
				}

				if(damaged) {
					System.out.println();
					System.out.println("=========================");
					System.out.println("남성좀비가 데미지를 입었습니다.");	
					Z.HP();			
					System.out.println();
					
				}
				else {
					System.out.println();
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
					System.out.println("남성좀비가 공격을 회피하였습니다.");
					Z.HP();
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();
				}
				
				if (Z.HP == 0) break;
				// 좀비가 공격을 합니다.
				System.out.println("!!!!!!!!Warning!!!!!!!!!!");
				System.out.println();
				System.out.println("남성좀비가 파일럿을 공격합니다!!.");	
				Z.분노();

				P.HP = P.HP - Z.Attack;
				if(P.HP < 0) {
					P.HP = 0;
				}
				P.HP();
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println();

			}
			else if (i1 == 2){
				 싸우기.intro6Music.close();
				System.out.println("숲으로 도망갑니다..체력회복을 위해 먹잇감을 탐색합니다..");

				int val1 = new Random().nextInt(4); // 확률적으로 0과 1중에 하나가 나옴

				if(val1 ==  0) {  // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@노루노루노루노루노루노루 

					System.out.println();
					System.out.println("노루를 발견하셨습니다");
					노루.정보();

					System.out.println("@@@@@@@1.사냥한다 2.되돌아가기 @@@@@@@");
					int 숲 = scanner.nextInt();

					if ( 숲 == 1) {  

						while (P.생존() && 노루.생존()) {
							System.out.println();

							System.out.println();			
							System.out.println("파일럿이 노루를 공격합니다.");
							System.out.println();					

							Thread nthread = new Thread(); {
								for(int i = 3; i > 0; i--) {
									System.out.println("노루 <<<<<< 파일럿 공격!");

									try {

										Thread.sleep(i * 300);
									} 
									catch (InterruptedException e) { }
								}
							}

							boolean damaged = 노루.be_damaged(P.Attack);
							if (노루.HP < 0) {
								노루.HP = 0;

							}

							if(damaged) {
								System.out.println();
								System.out.println("=========================");
								System.out.println("노루가 데미지를 입었습니다.");	
								노루.HP();			
								System.out.println();

							}

							else {
								System.out.println();
								System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
								System.out.println();
								System.out.println("노루가 공격을 회피하였습니다.");
								노루.HP();
								System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
								System.out.println();
								System.out.println();
								
							}
							if ( ! 노루.생존()) {
								아이템 item_tmp = 노루.아이템드랍();
								P.inven.아이템넣기(item_tmp);
								System.out.println("아이템 획득:" + item_tmp.name);
								break;
							}

							System.out.println("!!!!!!!!Warning!!!!!!!!!!");
							System.out.println();
							System.out.println("노루가 파일럿을 공격합니다!!.");	

							Thread nthread1 = new Thread(); {
								for(int i = 3; i > 0; i--) {
									System.out.println("노루 공격! >>>>>>> 파일럿");

									try {

										Thread.sleep(i * 100);
									} 
									catch (InterruptedException e) { }
								}
							}																						    

							P.HP = P.HP - 노루.Attack;
							if(P.HP < 0) {
								P.HP = 0;
							}
							P.HP();
							System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
							System.out.println();

						}

						if( ! P.생존()) {
							System.out.println("파일럿이 사망하였습니다.");
							System.out.println("게임을 종료합니다..");
						}

						else if ( P.생존()) {
							System.out.println("@@@@@@@@@ 노루를 잡았습니다 @@@@@@@@");
							System.out.println();

							int val3 = new Random().nextInt(1);  // 2로 수정할것 -------------------------------------!!

							Thread nthread = new Thread(); {
								for(int i = 3; i > 0; i--) {
									System.out.println(+i+" 노루를 채집중... ");

									try {

										Thread.sleep(i * 500);
									} catch (InterruptedException e) { }

								}
								if(val3 == 0) {
									System.out.println();
									노루.아이템드랍();
									System.out.println();
									System.out.println("인벤토리에 넣으시겠습니까?");
									System.out.println("1.예 2.아니오");
									int  아이템 = scanner.nextInt();
									if ( 아이템 == 1) {
										
									 
										아이템 [] 인벤토리 = {노루의_뿔};
										System.out.println("노루의 뿔을 인벤토리에 넣으셨습니다");  //@@@@@@@@@@@@@@@@@@@ 인벤토리 @@@@@@@@@@@@@@@@@
									     
									   // System.out.println(인벤토리.length);
										
									}

									else if ( 아이템 == 2) {
										System.out.println();
										System.out.println("좀비의 눈을 피해 이동합니다..");
										Thread nthread1 = new Thread(); {
											for(int i = 3; i > 0; i--) {
												System.out.println(+i+"이동중... ");

												try {

													Thread.sleep(i * 400);
												} catch (InterruptedException e) { }											
											}
											System.out.println("남성좀비와 마주쳤습니다!!");
										}	
									}
								}
								else if(val3 == 1) {
									System.out.println("아무것도 얻지 못하였습니다...");
									System.out.println();
									System.out.println("좀비의 눈을 피해 이동합니다..");
									Thread nthread1 = new Thread(); {
										for(int i = 3; i > 0; i--) {
											System.out.println(+i+"이동중... ");

											try {

												Thread.sleep(i * 400);
											}
											catch (InterruptedException e) { }
										}
										System.out.println();
										System.out.println("남성좀비와 마주쳤습니다!!");
									}				
								}									
							}

							노루.HP = 60; // 노루 다시 부활.
						}					
					}					
					else if ( 숲 == 2) 
					scanner.nextLine();
					싸우기.musicplayer6();
					continue;
				}
				else if (val1 == 1) {
					System.out.println("산삼을 발견하였습니다.(체력회복 + 20, 공격력 + 10  공격력은 50가 최대입니다.");
					P.HP = P.HP + 20;
					P.Attack = P.Attack + 10;
					if (P.Attack > 50) {
						P.Attack = 50;
					}
					if (P.HP > 100) {
						P.HP = 100;						
					}
				}
				else if (val1 == 2) {
					System.out.println();
					System.out.println("아무것도 발견하지 못하였습니다");
					System.out.println();
					
				}
				else if (val1 == 3) {       // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 사슴사슴사슴사슴사슴사슴
					System.out.println();
					System.out.println("사슴을 발견하셨습니다");
					사슴.정보();

					System.out.println("@@@@@@@1.사냥한다 2.되돌아가기 @@@@@@@");
					int 숲 = scanner.nextInt();

					if ( 숲 == 1) {    

						while (P.생존() && 사슴.생존()) {
							System.out.println();
							System.out.println();			
							System.out.println("파일럿이 사슴을 공격합니다.");
							System.out.println();					

							Thread nthread = new Thread(); {
								for(int i = 3; i > 0; i--) {
									System.out.println("사슴 <<<<<< 파일럿 공격!");

									try {

										Thread.sleep(i * 300);
									} 
									catch (InterruptedException e) { }
								}
							}
							boolean damaged = 사슴.be_damaged(P.Attack);
							if (사슴.HP < 0) {
								사슴.HP = 0;										

							}

							if(damaged) {
								System.out.println();
								System.out.println("=========================");
								System.out.println("사슴이 데미지를 입었습니다.");	
								노루.HP();			
								System.out.println();

							}
							else {
								System.out.println();
								System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
								System.out.println();
								System.out.println("사슴이 공격을 회피하였습니다.");
								노루.HP();
								System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
								System.out.println();
								System.out.println();

							}
							if ( ! 사슴.생존()) break;

							System.out.println("!!!!!!!!Warning!!!!!!!!!!");
							System.out.println();
							System.out.println("사슴이 파일럿을 공격합니다!!.");	

							Thread nthread1 = new Thread(); {
								for(int i = 3; i > 0; i--) {
									System.out.println("사슴 공격! >>>>>>> 파일럿");

									try {

										Thread.sleep(i * 100);
									} 
									catch (InterruptedException e) { }
								}
							}																		

							P.HP = P.HP - 사슴.Attack;
							if(P.HP < 0) {
								P.HP = 0;
							}

							P.HP();
							System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
							System.out.println();
						}
						if( ! P.생존()) {
							System.out.println("파일럿이 사망하였습니다.");
							System.out.println("게임을 종료합니다..");
						}
						else if ( P.생존()) {
							System.out.println("@@@@@@@@@ 사슴을 잡았습니다 @@@@@@@@");
							System.out.println();

							int val3 = new Random().nextInt(2);

							Thread nthread = new Thread(); {
								for(int i = 3; i > 0; i--) {
									System.out.println(+i+" 사슴을 채집중... ");

									try {
										Thread.sleep(i * 500);
									} 
									catch (InterruptedException e) { }
								}
								
								if(val3 == 0) {
									System.out.println();
									사슴.아이템드랍();
									System.out.println();
									System.out.println("인벤토리에 넣으시겠습니까?");
									System.out.println("1.예 2.아니오");
									int 아이템 = scanner.nextInt();
									if ( 아이템 == 1) {	
										아이템 [] 인벤토리 = {사슴고기};
										System.out.println("사슴고기를 인벤토리에 넣으셨습니다");  //@@@@@@@@@@@@@@@@@@@ 인벤토리 @@@@@@@@@@@@@@@@@
									    	
										//사슴.인벤토리_아이템("사슴고기");
									}
									else if (아이템 == 2) {
										System.out.println();
										System.out.println("좀비의 눈을 피해 이동합니다..");
										Thread nthread1 = new Thread(); {
											for(int i = 3; i > 0; i--) {
												System.out.println(+i+"이동중... ");

												try {
													Thread.sleep(i * 400);
												}
												catch (InterruptedException e) { }											
											}
											
											System.out.println();
											scanner.nextLine();
											싸우기.musicplayer6();
											System.out.println("남성좀비와 마주쳤습니다!!");
											
										}	
									}
								}
								
								else if(val3 == 1) {
									
									System.out.println("아무것도 얻지 못하였습니다...");
									System.out.println();
									System.out.println("좀비의 눈을 피해 이동합니다..");
									Thread nthread1 = new Thread(); {
										for(int i = 3; i > 0; i--) {
											System.out.println(+i+"이동중... ");

											try {
												Thread.sleep(i * 400);
											} 
											catch (InterruptedException e) { }
										}
										
										System.out.println("남성좀비와 마주쳤습니다!!");
										scanner.nextLine();
										싸우기.musicplayer6();
									}				
								}									
							}
							사슴.HP = 50; // 노루 다시 부활.
						}
					}		
				}
			}
			else if (i1 == 3) {
				Z.information();
			}
			else if (i1 == 4) {  // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			scanner.nextLine();		
		    System.out.println();				
			musicplayer 권총장전 = new musicplayer();
			권총장전.musicplayer8();
			System.out.println("Enter을 누르면 정보가 출력됩니다.");
			new 무기(20);
			scanner.nextLine();		
			System.out.println("=========+정보+==========");
			System.out.println("    총기 : 콜트M1911");
			System.out.println("   공격력 : 30   ");
			System.out.println("=========================");
			System.out.println();
			권총장전.intro8Music.close();
			}
				else if (i1 == 5) {
					new 인벤토리();
			   inven.아이템_보기();
				//	인벤토리 보기 = new 인벤토리();
				//	보기.아이템_보기();
				}
			  /* for ( int i = 0; i < 인벤토리.length;i++) {
				   String 아이템 = 인벤토리[i];
				   System.out.println(인벤토리+"");
			   } */
			}
		
		
		싸우기.intro6Music.close();
		배틀.intro7Music.close();
		}
		if (Z.HP > P.HP) {
			System.out.println("전투에서 패배하셨습니다..The End..");	
			System.out.println("게임이 종료됩니다.");
			
		}
		else if (Z.HP < P.HP) {
			System.out.println("!!전투에서 승리하셨습니다!!");		
			System.out.println();
			System.out.print("좀비들의 눈을 피해서 대피장소로 이동합니다...");
			System.out.println();

			Thread bthread = new Thread(); { 
				for(int i = 3; i > 0; i--) {
					System.out.println(+i+"초 대피장소로 이동중.. ");

					try {
						Thread.sleep(i * 200);
					} 
					catch (InterruptedException e) { }
				}
			} 		
			System.out.println();
			System.out.println("이동중에 여성좀비에게 발각 되셨습니다!...");
			
			while(G.HP > 0 && P.HP > 0) { // 파일럿이랑 좀비가 살아있는 한 계속 반복한다.
				
				// 좀비를 만나서 싸우는 부분
				System.out.println("##########1.싸운다 2.도망친다 3.여성좀비의 정보를 확인한다.###########");
				int k = scanner.nextInt();

				if( k == 1) {			
					System.out.println("-------여성좀비와의 전투를 시작합니다 -----");				
					System.out.println();			
					System.out.println("파일럿이 좀비를 공격합니다.");
					System.out.println();
					boolean damaged = G.be_damaged(P.Attack);
					
					if (G.HP < 0) {
						G.HP = 0;
					}
					
					if(damaged) {
						System.out.println();
						System.out.println("=========================");
						System.out.println();
						System.out.println("여성좀비가 데미지를 입었습니다.");	
						G.HP();									
						System.out.println();
					}
					else {
						System.out.println();
						System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
						System.out.println();
						System.out.println("여성좀비가 공격을 회피하였습니다.");
						G.HP();
						System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
						System.out.println();
					}
					if (G.HP == 0) break;
					// 좀비가 공격을 합니다.
					System.out.println("!!!!!!!!Warning!!!!!!!!!!");
					System.out.println();
					System.out.println("여성좀비가 파일럿을 공격합니다!!.");	
					G.은신();

					P.HP = P.HP - G.Attack;
					if(P.HP < 0) {
						P.HP = 0;
					}
					P.HP();
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println();

				}
				else if (k == 2){

					System.out.println("숲으로 도망갑니다..체력회복을 위해 먹잇감을 탐색합니다..");
					int val1 = new Random().nextInt(4); // 확률적으로 0과 1중에 하나가 나옴

					if(val1 ==  0) { 
						System.out.println("블루베리를 발견하였습니다.(체력회복 + 20)");
						P.HP = P.HP + 20;
						if (P.HP > 100) {
							P.HP = 100;						
						}
					}
					else if (val1 == 1) {
						System.out.println();
						System.out.println("아무것도 발견하지 못하였습니다..");
						System.out.println();

					}
					else if (val1 == 2) {
						System.out.println("산삼을 발견하였습니다.(체력회복 + 20, 공격력 + 15 ? 공격력은 55가 최대입니다.");
						P.HP = P.HP + 20;
						P.Attack = P.Attack + 15;
						if (P.Attack > 55) {
							P.Attack = 55;
						}
						if (P.HP > 100) {
							P.HP = 100;						
						}
					}
					else if (val1 == 3) {
						System.out.println("사슴을 발견하였습니다!");
						System.out.println("사슴을 포획합니다!");
						int val3 = new Random().nextInt(3);

						Thread nthread = new Thread(); {
							for(int i = 3; i > 0; i--) {
								System.out.println(+i+"초 사슴을 포획중.. ");

								try {
									Thread.sleep(i * 100);
								}
								catch (InterruptedException e) { }
							}
							if(val3 == 0) {
								System.out.println();
								System.out.println("사슴을 포획하는데 성공하셨습니다!");
								System.out.println("사슴고기 획득 (+HP50)");
								P.HP = P.HP +50;
								if (P.HP > 100) {
									P.HP = 100;
								}
							}
							else if(val3 == 1) {
								System.out.println("사슴을 포획하는데에 실패하셨습니다..");
							}
							else if(val3 == 2) {
								System.out.println("사슴을 포획하는데에 실패하셨습니다..");
							}
						}
					}
					P.HP();
				}
				else if (k == 3) {
					G.information();
				}
			}		
			if (G.HP > P.HP) {
				System.out.println("전투에서 패배하셨습니다..The End..");	
				System.out.println("게임이 종료됩니다.");
			}
			
			else if (G.HP < P.HP) {
				System.out.println("!!전투에서 승리하셨습니다!!");		
				System.out.println();
				System.out.println();
				System.out.println("밤이 되었습니다..");
				System.out.println("---------------------------------------------------");				
				System.out.println("  + 보스좀비(Tanker)가 활동하기 시작합니다.");
				System.out.println("---------------------------------------------------");
				System.out.println("Enter..");
				scanner.nextLine();
				System.out.println("좀비들을 피해 대피소로 이동합니다.");
				System.out.println("1번 :숲 / 2번:도로 / 3번 :오솔길 / 중 경로를 선택하세요.");
				int c = scanner.nextInt();
				
				if (c == 1) {
					System.out.println("다행히 아무일도 일어나지 않았습니다..");
					System.out.println("대피장소로 이동합니다..");

					Thread ethread = new Thread(); { 
						for(int i = 3; i > 0; i--) {
							System.out.println(+i+"초 대피장소로 이동중.. ");

							try {

								Thread.sleep(i * 500);
							} catch (InterruptedException e) { }
						}
					} 
					System.out.println();
					System.out.println("대피장소로 이동하는데에 성공하셨습니다!");

					Thread cthread = new Thread(); { 
						for(int i = 1; i > 0; i--) {
							System.out.println("구조대에게 지원요청 합니다");
							for(int l = 2; i > 0; i--) {
								System.out.println();
								System.out.println("구조대와 연락에 성공하였습니다!");
								System.out.println();

								try {

									Thread.sleep(i * 500);
								} catch (InterruptedException e) { }
							}
						}
					}
					Thread fthread = new Thread(); { 
						for(int i = 3; i > 0; i--) {	
							System.out.println("구조대가 당신의 위치를 파악중입니다..");

							try {
								Thread.sleep(i * 500);
							} 
							catch (InterruptedException e) { }
						}
					} 
					System.out.println();
					System.out.println("구조대가 당신의 위치를 파악하였습니다!");
					System.out.println();
					System.out.println("여기는 구조대 생존자를 발견했습니다");
					System.out.println();
					
					Thread nthread = new Thread(); {
						
						for(int o = 3; o > 0; o--) {
							System.out.println("생존자에게 접근중이다..");

							try {
								Thread.sleep(o * 300);
							} 
							catch (InterruptedException e) { }
						}
						System.out.println("보스좀비가 헬기소리로 인해 그들의 존재를 발견합니다!!");						
					}
					Thread rthread = new Thread(); {
						for(int o = 10; o > 0; o--) {
							System.out.println("Warning!!!Warning!!Warning!!Warning!!Warning!!Warning!!");

							try {
								Thread.sleep(o * 100);
							} 
							catch (InterruptedException e) { }
							System.out.println("잠깐! 생존자에게 뭔가 다가옵니다!!" );
						}
					}
				}

				else if (c == 2) {
					System.out.println("다행히 아무일도 일어나지 않았습니다..");
					System.out.println("대피장소로 이동합니다..");
					Thread ethread = new Thread(); { 
						for(int i = 3; i > 0; i--) {
							System.out.println(+i+"초 대피장소로 이동중.. ");

							try {
								Thread.sleep(i * 500);
							}
							catch (InterruptedException e) { }
						}
					}
					System.out.println();
					System.out.println("대피장소로 이동하는데에 성공하셨습니다!");

					Thread cthread = new Thread(); { 
						for(int i = 1; i > 0; i--) {
							System.out.println("구조대에게 지원요청 합니다");
							for(int l = 2; i > 0; i--) {
								System.out.println();
								System.out.println("구조대와 연락에 성공하였습니다!");
								System.out.println();

								try {
									Thread.sleep(i * 500);
								}
								catch (InterruptedException e) { }
							}
						}
					}
					Thread fthread = new Thread(); {
						
						for(int i = 3; i > 0; i--) {	
							System.out.println("구조대가 당신의 위치를 파악중입니다..");

							try {
								Thread.sleep(i * 500);
							} 
							catch (InterruptedException e) { }
						}
					}
					System.out.println();
					System.out.println("구조대가 당신의 위치를 파악하였습니다!");
					System.out.println();
					System.out.println("여기는 구조대 생존자를 발견했습니다");
					System.out.println();
					Thread nthread = new Thread(); {
						for(int o = 3; o > 0; o--) {
							System.out.println("생존자에게 접근중이다..");

							try {
								Thread.sleep(o * 400);
							} 
							catch (InterruptedException e) { }
						}
						System.out.println("보스좀비가 헬기소리로 인해 그들의 존재를 발견합니다!!");						
					}

					Thread rthread = new Thread(); {

						for(int o = 7; o > 0; o--) {
							System.out.println("Warning!!!Warning!!Warning!!Warning!!Warning!!Warning!!");

							try {
								Thread.sleep(o * 100);
							}
							catch (InterruptedException e) { }
							System.out.println("잠깐! 생존자에게 무언가가 다가옵니다!!" );
						}
					}
				}

				else if (c == 3) {
					System.out.println("Tanker에게 발각되셨습니다..!");
					System.out.println("전투가 시작됩니다!");
				}
				while(P.HP > 0 && T.HP > 0) { // 파일럿이랑 좀비가 살아있는 한 계속 반복한다.

					// 좀비를 만나서 싸우는 부분


					System.out.println("##########1.싸운다 2.도망친다 3. Tanker의 정보를 확인한다.###########");
					int i = scanner.nextInt();

					if( i == 1) {			
						System.out.println("-------Tanker와의 전투를 시작합니다 -----");				
						System.out.println();			
						System.out.println("파일럿이 Tanker를 공격합니다.");
						System.out.println();
						boolean damaged = T.be_damaged(P.Attack);
						if (T.HP < 0) {
							T.HP = 0;
						}
						if(damaged) {
							System.out.println();
							System.out.println("=========================");
							System.out.println("Tanker가 데미지를 입었습니다.");	
							T.HP();			
							System.out.println("=========================");
							System.out.println();
						}
						else {
							System.out.println();
							System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
							System.out.println("Tanker가 공격을 회피하였습니다.");
							T.HP();
							System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
						}
						if (T.HP == 0) break;
						// 좀비가 공격을 합니다.
						System.out.println("!!!!!!!!Warning!!!!!!!!!!");
						System.out.println();
						System.out.println("Tanker가 파일럿을 공격합니다!!.");				
						P.HP = P.HP - T.Attack;
						if(P.HP < 0) {
							P.HP = 0;
						}
						P.HP();
						System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");					
					}

					else if (i == 2){

						System.out.println("숲으로 도망갑니다..체력회복을 위해 먹잇감을 탐색합니다..");
						int val1 = new Random().nextInt(4); // 확률적으로 0과 1중에 하나가 나옴

						if(val1 ==  0) { 
							System.out.println("블루베리를 발견하였습니다.(체력회복 + 20)");
							P.HP = P.HP + 20;
							if (P.HP > 100) {
								P.HP = 100;						
							}
						}
						else if (val1 == 1) {

							System.out.println("산삼을 발견하였습니다.(체력회복 + 20, 공격력 + 15 ? 공격력은 55가 최대입니다.)");
							P.HP = P.HP + 20;
							P.Attack = P.Attack + 15;
							if (P.Attack > 55) {
								P.Attack = 55;
							}
							if (P.HP > 100) {
								P.HP = 100;						
							}
						}
						else if (val1 == 2) {
							System.out.println();
							System.out.println("아무것도 발견하지 못하였습니다");
							System.out.println();
						}
						else if (val1 == 3) {
							System.out.println("사슴을 발견하였습니다!");
							System.out.println("사슴을 포획합니다!");
							int val3 = new Random().nextInt(3);

							Thread nthread = new Thread(); {
								for(int o = 3; o > 0; o--) {
									System.out.println(+o+"초 사슴을 포획중.. ");

									try {

										Thread.sleep(o * 100);
									} catch (InterruptedException e) { }
								}

								if(val3 == 0) {
									System.out.println();
									System.out.println("사슴을 포획하는데 성공하셨습니다!");

									System.out.println("사슴고기 획득 (+HP50)");
									P.HP = P.HP +50;
									if (P.HP > 100) {
										P.HP = 100;
									}
								}
								else if(val3 == 1) {
									System.out.println("사슴을 포획하는데에 실패하셨습니다..");
								}
								else if(val3 == 2) {
									System.out.println("사슴을 포획하는데에 실패하셨습니다..");
								}
							}
						}
						P.HP();
					}
					else if (i == 3) {
						T.information();
					}
				}
				if (T.HP > P.HP) {
					System.out.println("전투에서 패배하셨습니다..The End..");	
				}
				
				else if (T.HP < P.HP) {
					System.out.println("!!전투에서 승리하셨습니다!!");		
					System.out.println();

					Thread tthread = new Thread(); 

					tthread.start();

					for(int i = 1; i > 0; i--) {
						System.out.println("@@@@@@@@@@@ 무사히 구조되셨습니다!! @@@@@@@@@@ ");				

						try {
							Thread.sleep(i * 300);
						} 
						catch (InterruptedException e) { }
					}
					System.out.println("게임을 종료합니다.");
				}
			}
		}
	}
}

	