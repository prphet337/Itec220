import java.util.Random;
public class Logic 
{
	//Cards card = new Cards();
	Cards[] deck = new Cards[52]; 
	CardTable table = new CardTable();
	int i = 0;
	Cards[] Dealer = new Cards[0];
	Cards[] Player = new Cards[0];
	//Image[] cardBack = new Image[5];
	//Image[] card = new Image[6];
	int GameStarted = 0;
	//Random shuffle = new Random();
	String outcome = "";
	int dealerSum = 0;
	int playerSum = 0;
	Random generator = new Random();
	
	public Logic()
	{
		
	}
	public void Shuffle()
	{
		for ( int i = 0; i < deck.length; i++ ) 
        {
			int j = ( int ) ( Math.random() * 52 );
			Cards temp = deck[i]; 
			deck[i] = deck[j]; 
			deck[j] = temp; 
        }
	}
	public void Deal()
	{
		int index = 0;
		
        do 
        {
        	index = generator.nextInt(52);
        } 
        while (deck[index] == null);
			i--;
		
		Cards temp = deck[index];
		deck[index] = null;
		//return temp;
		
		for(int i = 0; i <= 2; i++)
		{
			Dealer[i] = deck[i];
			for(int j = 0; j <= 2; j++)
			{
				Player[j] = deck[j];
			}
		}
		
		//String PlayerTotal = Player[0].card_value + Player[1].card_value; 
		
		
		if (GameStarted == 0)
		{
			//System.out.println("In If");
			GameStarted = 1;
			
			if((Player[0].card_value == "A" || Player[0].card_value == "T" 
				|| Player[0].card_value == "J" || Player[0].card_value == "Q"
					|| Player[1].card_value == "K") && (Player[1].card_value == "T"
					|| Player[1].card_value == "J" || Player[1].card_value == "Q"
						|| (Player[1].card_value == "K")))
					{
						outcome = "Blackjack";
					}
			else if(Player[0].card_value == "A" && Player[1].card_value == "A")
			{
				
			}
		}
	}
		
	public void Hit()
	{
		int x = 2;
		int index = generator.nextInt(52);
		Player[x] = deck[index];
		x++;
		
		int index2 = generator.nextInt(52);
		Dealer[x] = deck[index2];
		x++;
		
		
		for(int i=0; i<Player.length; i++)
		{
			if(Player[i].card_value.equals("T") || Player[i].card_value.equals("J") 
					|| Player[i].card_value.equals("K") || Player[i].card_value.equals("Q"))
			{
				playerSum += 10;
			}
			
			else if(Player[i].card_value.equals("2"))
			{
				playerSum += 2;
			}
			
			else if(Player[i].card_value.equals("3"))
			{
				playerSum += 3;
			}
			
			else if(Player[i].card_value.equals("4"))
			{
				playerSum += 4;
			}
			
			else if(Player[i].card_value.equals("5"))
			{
				playerSum += 5;
			}
			
			else if(Player[i].card_value.equals("6"))
			{
				playerSum += 6;
			}
			
			else if(Player[i].card_value.equals("7"))
			{
				playerSum += 7;
			}
			
			else if(Player[i].card_value.equals("8"))
			{
				playerSum += 8;
			}
			
			else if(Player[i].card_value.equals("9"))
			{
				playerSum += 9;
			}
			
			else if(Player[i].card_value.equals("A") && playerSum <= 10)
			{
				playerSum += 11;
			}
			
			else if(Player[i].card_value.equals("A") && playerSum > 10)
			{
				playerSum += 1;
			}
		}
		
		
		for(int i=0; i<Dealer.length; i++)
		{
			if(Dealer[i].card_value.equals("T") || Dealer[i].card_value.equals("J") 
					|| Dealer[i].card_value.equals("K") || Dealer[i].card_value.equals("Q"))
			{
				dealerSum += 10;
			}
			
			else if(Dealer[i].card_value.equals("2"))
			{
				dealerSum += 2;
			}
			
			else if(Dealer[i].card_value.equals("3"))
			{
				dealerSum += 3;
			}
			
			else if(Dealer[i].card_value.equals("4"))
			{
				dealerSum += 4;
			}
			
			else if(Dealer[i].card_value.equals("5"))
			{
				dealerSum += 5;
			}
			
			else if(Dealer[i].card_value.equals("6"))
			{
				dealerSum += 6;
			}
			
			else if(Dealer[i].card_value.equals("7"))
			{
				dealerSum += 7;
			}
			
			else if(Dealer[i].card_value.equals("8"))
			{
				dealerSum += 8;
			}
			
			else if(Dealer[i].card_value.equals("9"))
			{
				dealerSum += 9;
			}
			
			else if(Dealer[i].card_value.equals("A") && playerSum <= 10)
			{
				dealerSum += 11;
			}
			
			else if(Dealer[i].card_value.equals("A") && playerSum > 10)
			{
				dealerSum += 1;
			}
		}
	}
	
	public void Stand()
	{
		if(playerSum > dealerSum)
		{
			outcome = "Win";
		}
		
		else if(playerSum < dealerSum)
		{
			outcome = "Lose";
		}
		
		else if(playerSum == dealerSum)
		{
			outcome = "Tie";
		}
	}
}