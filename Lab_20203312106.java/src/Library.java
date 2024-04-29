import java.util.Random;
import java.util.Scanner;
public class BlackJack {
	// 하우스 첫 비밀 덱 출력
	static public void first_print_house_state(House houseInstance) {
		
		System.out.print("House: HIDDEN, ");
		
		
		int value = houseInstance.cards[1].val;	
		switch(value) {
			case 97:
				System.out.print("a");
				break;
			case 106:
				System.out.print("j");
				break;
			case 107:
				System.out.print("k");
				break;
			case 113:
				System.out.print("q");
				break;
			default:
				System.out.print(value);
		}// val 값 출력 구문.
        
        System.out.println(houseInstance.cards[1].suit);
        
	}
	// 하우스 덱 출력
	static public void print_house_state(House playerInstance) {
		System.out.print("House: ");
		int sum = 0;
		for(int i = 0; i < playerInstance.num_card; i++) {
			sum += playerInstance.cards[i].val;
			if( i == playerInstance.num_card-1) {
				int value = playerInstance.cards[i].val;	
				switch(value) {
					case 97:
						System.out.print("a");
						break;
					case 106:
						System.out.print("j");
						break;
					case 107:
						System.out.print("k");
						break;
					case 113:
						System.out.print("q");
						break;
					default:
						System.out.print(value);
				}// val 값 출력 구문.
		        System.out.print(playerInstance.cards[i].suit);		        
			}
			else {
				int value = playerInstance.cards[i].val;	
				switch(value) {
					case 97:
						System.out.print("a");
						break;
					case 106:
						System.out.print("j");
						break;
					case 107:
						System.out.print("k");
						break;
					case 113:
						System.out.print("q");
						break;
					default:
						System.out.print(value);
				}// val 값 출력 구문.
		        System.out.print(playerInstance.cards[i].suit);
		        System.out.print(", ");
			}
		}       
        System.out.print(" ("+sum+")");
	}
	
	// player 덱 출력
	static public void print_player_state(player playerInstance) {
		System.out.print("Player1: ");
		int sum = 0;
		for(int i = 0; i < playerInstance.num_card; i++) {
			sum += playerInstance.cards[i].val;
			if( i == playerInstance.num_card-1) {
				int value = playerInstance.cards[i].val;	
				switch(value) {
					case 97:
						System.out.print("a");
						break;
					case 106:
						System.out.print("j");
						break;
					case 107:
						System.out.print("k");
						break;
					case 113:
						System.out.print("q");
						break;
					default:
						System.out.print(value);
				}// val 값 출력 구문.
		        System.out.print(playerInstance.cards[i].suit);		        
			}
			else {
				int value = playerInstance.cards[i].val;	
				switch(value) {
					case 97:
						System.out.print("a");
						break;
					case 106:
						System.out.print("j");
						break;
					case 107:
						System.out.print("k");
						break;
					case 113:
						System.out.print("q");
						break;
					default:
						System.out.print(value);
				}// val 값 출력 구문.
		        System.out.print(playerInstance.cards[i].suit);
		        System.out.print(", ");
			}
		}       
        System.out.print(" ("+sum+")");
	}
	
	// computer 덱 출력
	static public void print_computer_state(Computer computerInstance, int n) {
		int sum = 0;
		System.out.print("Player"+n+": ");
		for(int i = 0; i < computerInstance.num_card; i++) {
			
			sum += computerInstance.cards[i].val;
			if( i == computerInstance.num_card-1) {
				int value = computerInstance.cards[i].val;	
				switch(value) {
					case 97:
						System.out.print("a");
						break;
					case 106:
						System.out.print("j");
						break;
					case 107:
						System.out.print("k");
						break;
					case 113:
						System.out.print("q");
						break;
					default:
						System.out.print(value);
				}// val 값 출력 구문.
		        System.out.print(computerInstance.cards[i].suit);		        
			}
			else {
				int value = computerInstance.cards[i].val;	
				switch(value) {
					case 97:
						System.out.print("a");
						break;
					case 106:
						System.out.print("j");
						break;
					case 107:
						System.out.print("k");
						break;
					case 113:
						System.out.print("q");
						break;
					default:
						System.out.print(value);
				}// val 값 출력 구문.
		        System.out.print(computerInstance.cards[i].suit);
		        System.out.print(", ");
			}
		}       
        System.out.print(" ("+sum+")");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("사용자 수 입력: ");
		int player_num = scanner.nextInt();
		
		int seed = Integer.parseInt(args[0]);
		
		Deck deck = new Deck(52);
		
		deck.shuffle(seed);
		//house 객체 생성

		House houseInstance  = new House();
		// player 객체
		player playerInstance = new player();
		// computer 객체들
        Computer[] computers = new Computer[player_num- 1];
        
        
        for (int i = 0; i < player_num - 1; i++) {
            computers[i] = new Computer(); 
        }
        // Step1. 두장씩 나눠주기.
        for(int i = 0; i < player_num + 1; i++) {
        	if(i == 0) {
        		houseInstance.add_card(deck.dealCard());
        		houseInstance.add_card(deck.dealCard());
        		continue;
        	}
        	else if(i == 1) {
        		playerInstance.add_card(deck.dealCard());
        		playerInstance.add_card(deck.dealCard());
        		continue;
        	}
        	else {
        		computers[i-2].add_card(deck.dealCard());
        		computers[i-2].add_card(deck.dealCard());
        		continue;
        	}
        }
        
        // 첫 순환떄
        //자신의 덱 출력
        first_print_house_state(houseInstance);
        System.out.println("");
        print_player_state(playerInstance);
        System.out.println("");
        for (int i = 0; i < player_num - 1; i++) {
            print_computer_state(computers[i], i+2); 
            System.out.println("");
        }
        
        //hit or stand or bust!!
        for(int i = 0; i < player_num; i++) {
        	if(i == 0) {
        		System.out.println("---Player1 turn---");
        		String order = scanner.nextLine();
        		while(order != "Hit") {
        			playerInstance.add_card(deck.dealCard());
        			print_player_state(playerInstance);
        			int sum_of_Cards = 0;
        			for(int j = 0; i <playerInstance.num_card; j++ ) {
        				sum_of_Cards += playerInstance.cards[j].val;
        			}
        			if(sum_of_Cards > 21) {
        				System.out.println(" - Bust!");
        				break;
        			}
        			System.out.println("");
        			order = scanner.nextLine();
        			
        		}
        		print_player_state(playerInstance);
        		System.out.println("");
        	}
        	
        	//player case
        	
        	else{
        		System.out.println("---Player"+i+1+" turn---");
        		String is_Hit = computers[i-1].hit_or_state();
        		System.out.println(is_Hit);
        		while(is_Hit != "Hit") {
        			computers[i-1].add_card(deck.dealCard());
        			print_computer_state(computers[i-1],i+1);
        			int sum_of_Cards = 0;
        			for(int j = 0; i <computers[i-1].num_card; j++ ) {
        				sum_of_Cards += computers[i-1].cards[j].val;
        			}
        			if(sum_of_Cards > 21) {
        				System.out.println(" - Bust!");
        				break;
        			}
        			System.out.println("");
        			is_Hit = computers[i-1].hit_or_state();
        			System.out.println(is_Hit);
        			
        			
        		}
        		print_computer_state(computers[i-1],i+1);
        		System.out.println("");
        		
        		
        		
        	}//computer case
        	
        	//house deck
        	System.out.println("---House turn---");
        	print_house_state(houseInstance);
        	System.out.println("");
        	String house_is_hit = houseInstance.is_hit();
        	System.out.println(house_is_hit);
        	while(house_is_hit != "Hit"){
        		houseInstance.add_card(deck.dealCard());
        		print_house_state(houseInstance);
        		int sum_of_Cards = 0;
    			for(int j = 0; i <houseInstance.num_card; j++ ) {
    				sum_of_Cards += houseInstance.cards[j].val;
    			}
    			if(sum_of_Cards > 21) {
    				System.out.println(" - Bust!");
    				break;
    			}
    			house_is_hit = houseInstance.is_hit();
    			System.out.println(house_is_hit);
    			
        	}
        	print_house_state(houseInstance);
        	System.out.println("");
        	
        	
        	//Game result!!
        	System.out.println("---Game Results ---");
        	
        	
        	
        	
        	
        }
        
        
        
        
        
        
        
        
        //
		//your code!
	}
}

class Card{
	public int val;
	public char suit;
	public Card() {
		
	}
	public Card(int theValue,char theSuit) {
		this.val = theValue;
		this.suit = theSuit;
	}
}

class Deck{
	private Card[] deck;
	private int cardsUsed;
	public Deck(int num) {
		deck = new Card[num];
		for(int i = 0; i <4 ; i++) {
			for(int j = 0; j <13; j++) {
				switch(i) {
					case 0:
						if(j+1 ==1) {
							deck[13*i+j] = new Card('a','c');
						}
						else if(j+1 == 11) {
							deck[13*i+j] = new Card('j','c');
						}
						else if(j+1 == 12) {
							deck[13*i+j] = new Card('q','c');
						}
						else if(j+1 == 13) {
							deck[13*i+j] = new Card('k','c');
						}
						else{
							deck[13*i+j] = new Card(j+1,'c');
						}
						break;
					case 1:
						if(j+1 ==1) {
							deck[13*i+j] = new Card('a','h');
						}
						else if(j+1 == 11) {
							deck[13*i+j] = new Card('j','h');
						}
						else if(j+1 == 12) {
							deck[13*i+j] = new Card('q','h');
						}
						else if(j+1 == 13) {
							deck[13*i+j] = new Card('k','h');
						}
						else{
							deck[13*i+j] = new Card(j+1,'h');
						}
						
						break;
					case 2:
						if(j+1 ==1) {
							deck[13*i+j] = new Card('a','d');
						}
						else if(j+1 == 11) {
							deck[13*i+j] = new Card('j','d');
						}
						else if(j+1 == 12) {
							deck[13*i+j] = new Card('q','d');
						}
						else if(j+1 == 13) {
							deck[13*i+j] = new Card('k','d');
						}
						else{
							deck[13*i+j] = new Card(j+1,'d');
						}
						break;
					case 3:
						if(j+1 ==1) {
							deck[13*i+j] = new Card('a','s');
						}
						else if(j+1 == 11) {
							deck[13*i+j] = new Card('j','s');
						}
						else if(j+1 == 12) {
							deck[13*i+j] = new Card('q','s');
						}
						else if(j+1 == 13) {
							deck[13*i+j] = new Card('k','s');
						}
						else{
							deck[13*i+j] = new Card(j+1,'s');
						}
						break;
				
				}
			}//52장 카드 생성
		
		
		}//card 배정
	}
	public void shuffle(int seed) {
		Random random = new Random(seed);
		for ( int i = deck.length-1;i>0; i--) {
			int rand =(int)(random.nextInt(i+1));
			Card temp = deck[i];
			deck[i] = deck[rand];
			deck[rand] =temp;
		}
		cardsUsed = 0;
	}//바꾸기 금지.`
	public Card dealCard() {
		if(cardsUsed == deck.length) {
			throw new IllegalStateException("No cards are left in the deck.");
			
		}
		cardsUsed++;
		return deck[cardsUsed-1];
	}//바꾸기 금지.
}

class Hand{
	
	public	Card[] cards = new Card[20];// 가지고 있는 카드.
	public	Hand() {
		for(int i = 0; i < 20; i++) {
			cards[i] = new Card();
		}
	}
	public	int num_card = 0;
	public	void add_card(Card card) {
		this.cards[num_card] = card;
		this.num_card++;
	}
	
	
	
	
	
}//Set of cards in your hand
class Computer extends Hand{
	Computer(){
		super();
	}
	// computer class가 hit 할지 state할지 string을 반환하는 method.
	public String hit_or_state() {
		int sum_cards = 0;
		int is_ace = 0;
		for(int i=0; i < this.num_card; i++) {
			int num = this.cards[i].val;
			switch(num) {
				case 97:
					sum_cards += 11;
					is_ace= 1;
					break;
				case 106:
					sum_cards += 10;
					break;
				case 107:
					sum_cards += 10;
					break;
				case 113:
					sum_cards += 10;
					break;
				default:
					sum_cards += this.cards[i].val;
					break;
			}
			
		}
		if(sum_cards>21) {
			if(is_ace == 1) {
				sum_cards -= 10;
			}
		}
		if(sum_cards < 14) {
			return "Hit";
		}
		else if(sum_cards > 17) {
			return "Stand";
		}
		else {
			Random random = new Random();
			int is_hit  = (int)(random.nextInt(2));
			if(is_hit == 1) {
				return "Hit";
			}
			else {
				return "Stand";
			}
		}
	}
	
	
}//Player automatically participates
class player extends Hand{
	player(){
		super();
	}
	
	
	
	
	
} //Player you control
class House extends Hand{
	House(){
		super();
	}
	public String is_hit() {
		int sum_cards = 0;
		int is_ace = 0;
		for(int i=0; i < this.num_card; i++) {
			int num = this.cards[i].val;
			switch(num) {
				case 97:
					sum_cards += 11;
					is_ace = 1;
					break;
				case 106:
					sum_cards += 10;
					break;
				case 107:
					sum_cards += 10;
					break;
				case 113:
					sum_cards += 10;
					break;
				default:
					sum_cards += this.cards[i].val;
					break;
			}
			
		}
		if(sum_cards>21) {
			if(is_ace == 1) {
				sum_cards -= 10;
			}
		}
		if(sum_cards <= 16) {
			return "Hit";
		}
		else  {
			return "Stand";
		}
	}
	
	
}//house
