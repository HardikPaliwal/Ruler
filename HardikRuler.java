/*AUthor: Hardik Paliwal
 * Program: Ruler
 * Date: April 19. 2016
 * Description: Is a RPG game
 * 
 * */

//If  the game lags, Remove System.nanoTime (crt+f and search)
import javax.swing.JOptionPane;
import java.util.Date;

public class HardikRuler
{
  //I asked you about having these 3 global variables, you had said yes that I could have all of them
  //point is the point system
  int point=0;
  //name is the name
  String Name="Rohan";
  //Speed determines the printSLow speed
int Speed=30;

  public static void main (String args [])
  {
    new HardikRuler ();
  }
  public HardikRuler ()
  {
    char input='y';
    while (input=='y'||input=='Y')
    {
    // This measures the time elasped, will be used at the end of my game to tell the user for how long they played the game
    long tStart = System.nanoTime();   
    char run='n';
    while (run!='y')
    {
      point=0;
      run=IBIO.inputChar ("Do you wish to start? (y/n)>> ");
      if (run=='n'||run=='N')
        System.out.println ("Really? Why would you even open this then?");
      else if (run=='y'||run=='Y')
      {
         Date d = new Date();
    printSlow1 ("Operation Ruler Activated \n Date and Time: "+ d,25 );
    causeSlow ("","",1000);
        printSlow1 ("WELCOME TO....", 100);
      }
      else
        JOptionPane.showMessageDialog(null, "Please enter a valid answer");
    }
    title ();
    printSlow1 (" For full game experiance, press the upwards facing triangle above the interactions panel", 10);
    char wish='c';
    
    while (wish!='g'&&wish!='G')
    {
      wish=IBIO.inputChar ("What do you demand?(G/S/C)>> ");
      if (wish=='s'|| wish=='S')
      {
        printSlow1 ("Settings",70);
  Speed=IBIO.inputInt("Speed at which to print words at? (The smaller the number the faster it will print. Recomended speed is 30)>> ");
     // This changes the printslow speed
      }
      else if (wish=='c'||wish=='C')
      {
        printSlow1 ("Credits", 30);
        System.out.println ("");
        printSlow1 ("Made and Developed by: \n Paliwal Studios", 50);
      }
      else if (wish=='g'||wish=='G')
      {
        printSlow1 ("And so", 40);
        printSlow1 ("It began...", 40);
      }
      else 
        JOptionPane.showMessageDialog(null, "Please enter a valid answer");
    }
    //                                                                                                                               START OF GAME
    space ();
    printSlow ("In a world surrounded by enemies, a Hero stood tall"); 
    space ();
     Name=IBIO.inputString ("His name was:>> ");
    space ();
    printSlow1 ("Welcome ", 10);
    System.out.print(Name);
    printSlow (", you are the last hope for the kingdom of Inmelius"); 
    space ();
    dragon ();
    System.out.println ("\n\n\n\n");
    printSlow ("Your Family is descended from the great dragons of eons past");
    printSlow ("Alexander the great, your father and the Lawful king of Inmelius has passed into the void as of yesterday");
    printSlow ("The task of running this once great nation now falls upon your shoulders");
    space(); 
    printSlow ("My king, here is current status of your nation");
    space ();
    map ();
    history ();
    character ();
    printSlow ("This is you, a 24 year old prince");
    printSlow1 ("Now you must rule your nation", 50);
    loading (5);
        printSlow ("The game runs on points. Every time you suceed in a quest you gain points and  mistake you make will cost points");
    printSlow ("The boss levels will unlock after a certain number of points has been reached");
    printSlow1 ("Farewell and good luck",50);
    causeSlow ("","",1000);
    space ();
    interactionsPanel ();
    // This is where the user comes after they complete all the quests
    
      long tEnd = System.nanoTime();
    long tDelta = tEnd - tStart;
double elapsedSeconds = tDelta/1000000000;
      System.out.println ("It Took you " + elapsedSeconds/60 + " minutes to finish the game");
       input=IBIO.inputChar ("Do you wish to play again(Y/N)? ");
       if (input!='y'&&input!='Y'&&input!='n'&&input!='N')
       {
         JOptionPane.showMessageDialog(null, "Please enter a valid answer");
         input=IBIO.inputChar ("Do you wish to play again(Y/N)? ");
       }
     
    }
    printSlow1 ("Farewell and good luck my friend. Wish you the best of luck in your future endevours",50);
    //                                                                                                                                        End of Intro
    
    
    
  }
  //                                                                                                                      Only methods past this point
  //                                                                                                                      All ASCII Art can be found in the begaining generally
  //                                                                                                                         Note very messy: If you need a method find try to search for it-Most methods are void
  public void title ()
  {
    System.out.println (" _______           _        _______  _______ ");
    System.out.println ("(  ____ )|\\     /|( \\     (  ____ \\(  ____ )");
    System.out.println ("| (    )|| )   ( || (      | (    \\/| (    )|");
    System.out.println ("| (____)|| |   | || |      | (__    | (____)|");
    System.out.println ("|     __)| |   | || |      |  __)   |     __)");
    System.out.println ("| (\\ (   | |   | || |      | (      | (\\ (   ");
    System.out.println ("| ) \\ \\__| (___) || (____/\\| (____/\\| ) \\ \\__");
    System.out.println ("|/   \\__/(_______)(_______/(_______/|/   \\__/\n\n\n");
    System.out.println ("S-Setting                      C-Credits");
    System.out.println ("                  G-Game   ");                      
  }
  public void dragon ()
  {
    System.out.println (""); 
    System.out.println ("                                     <xeee..          ");                    
    System.out.println ("                                   ueeeeeu..^*$e.     ");                     
    System.out.println ("                            ur d$$$$$$$$$$$$$$Nu *Nu    ");                   
    System.out.println ("                          d$$$    $$$$$$$$$$$$$$$$$$e.$c   ");                  
    System.out.println ("                      u$$c          ^^**$$$$$$$$$$$$$b.^R:   ");                
    System.out.println ("                    z$$#               `!?$$$$$$$$$$$$$N.^      ");             
    System.out.println ("                  .$P                   ~!R$$$$$$$$$$$$$b   ");                
    System.out.println ("                 x$F                 **$b. '  R).$$$$$$$$$$   ");               
    System.out.println ("               J^                            #$$$$$$$$$$$$.  ");              
    System.out.println ("              z$e                      ..        **$$$$$$$$$   ");             
    System.out.println ("              :$P           .        .$$$$$b.    ..      #$$$$    ");           
    System.out.println ("             $$            L          ^*$$$$b   '      4$$$$L    ");          
    System.out.println ("             4$$            ^u    .e$$$$e.''*$$$N.       @$$$$$    ");          
    System.out.println ("             $$E            d$$$$$$$$$$$$$$L ''$$$$$  mu $$$$$$F    ");         
    System.out.println ("             $$&            $$$$$$$$$$$$$$$$N   '#* * ?$$$$$$$N     ");        
    System.out.println ("             $$F            '$$$$$$$$$$$$$$$$$bec...z$ $$$$$$$$      ");       
    System.out.println ("            '$$F             `$$$$$$$$$$$$$$$$$$$$$$$$ '$$$$E'$     ");        
    System.out.println ("             $$                  ^''''''`       ^''*$$$& 9$$$$N    ");          
    System.out.println ("             k  u$                                  ''$$. '$$P r       ");      
    System.out.println ("             4$$$$L                                   '$. eeeR     ");         
    System.out.println ("              $$$$$k                                   '$e. .@    ");          
    System.out.println ("              3$$$$$b                                   '$$$$    ");           
    System.out.println ("               $$$$$$                                    3$$'   ");            
    System.out.println ("                $$$$$  dc                                4$F    ");            
    System.out.println ("                RF** <$$                                J'     ");            
    System.out.println ("                  #bue$$$LJ$$$Nc.                        '    ");              
    System.out.println ("                  ^$$$$$$$$$$$$$r                            ");          
    // Link: http://www.chris.com/ascii/index.php?art=video%20games/mortal%20kombat
  }
  
  public void map () 
  {
    space ();
    System.out.println ("                           ,-.^._                 _");
    System.out.println ("           Dragons Den    .'      `-.            ,' ;");
    System.out.println ("                /o`-. ,----'         `-.   _  ,-.,'  `");
    System.out.println ("             _.'   `--'   |              `-' '-'      ;");
    System.out.println ("The         :              |                          ;    __,-.");
    System.out.println ("End         ,'             |    Mazar-i-Sharif       ;_,-',.__'--.");
    System.out.println ("Of         :    INMELIUS    |                          ,--```    `--'");
    System.out.println ("The        :                 |      ________________ ;             The Sea of ");
    System.out.println ("World      :                | _____|                :                    Pirates    ");
    System.out.println ("           ;      o        |                      :                   |    |    |");
    System.out.println ("          (     Chromata    |                      o;                 )_)  )_)  )_)");
    System.out.println ("           `-.              |                    ,'Pirates Bay       )___))___))___)\\");
    System.out.println ("             ;               |          Kabul   :                   _____|____|____\\\\__");
    System.out.println ("           .'_________________|_____________.-._,'         ---------\\                  /---------");
    System.out.println ("         .'                               `.                  ^^^^^ ^^^^^^^^^^^^^^^^^^^^^");
    System.out.println ("      _.'      o                         .__;");
    System.out.println ("      `._       Mordor                  ;");
    System.out.println ("         `.             Kandahar       :    ,------------------------.");
    System.out.println ("           `.               ,..__,---._;    | The Kingdoms of Fear   |");
    System.out.println ("             `-.__         :                |                        |");
    System.out.println ("                  `.--.____;      Gr        | Pop: 28,150,000 (2009) |");
    System.out.println ("                                            | Area: 251,772 sq.mi.   |");
    System.out.println ("                                            |      (652,086 sq.km.)  |");
    System.out.println ("                                            `------------------------'");
    //Link :http://www.chris.com/ascii/index.php?art=places/maps
    // Note: I changed the original ASCII art to suite my needs (Added states and the pirate ship)
    //The original ascii art is a map of afganistan  
  }
  public void character ()
  {
    System.out.println ("");    
    System.out.println ("                            /|");  
    System.out.println ("                          /'||");  
    System.out.println ("                         |  ||");  
    System.out.println ("                         |  ||");  
    System.out.println ("                         |  ||         __.--._");  
    System.out.println ("                         |  ||      /~~   __.-~\\ _");  
    System.out.println ("                         |  ||  _.-~ / _---._ ~-\\/~\\");  
    System.out.println ("                         |  || // /  /~/  .-  \\  /~-\\");  
    System.out.println ("                         |  ||((( /(/_(.-(-~~~~~-)_/ |");  
    System.out.println ("                         |  || ) (( |_.----~~~~~-._\\ /");  
    System.out.println ("                         |  ||    ) |              \\_|");  
    System.out.println ("                         |  ||     (| =-_   _.-=-  |~)         ,");  
    System.out.println ("                         |  ||      | `~~ |   ~~'  |/~-._-'/'/_,");  
    System.out.println ("                         |  ||       \\    |        /~-.__---~ , ,");  
    System.out.println ("                         |  ||       |   ~-''     || `\\_~~~----~");  
    System.out.println ("                         |  ||_.ssSS$$\\ -====-   / )\\_  ~~--~");  
    System.out.println ("                 ___.----|~~~|%$$$$$$/ \\_    _.-~ /' )$s._");  
    System.out.println ("        __---~-~~        |   |%%$$$$/ /  ~~~~   /'  /$$$$$$$s__");  
    System.out.println ("      /~       ~\\    ============$$/ /        /'  /$$$$$$$$$$$SS-.");  
    System.out.println ("   /'      ./\\\\\\\\\\\\_( ~---._(_))$/ /       /'  /$$$$%$$$$$~      \\");  
    System.out.println ("    (      //////////(~-(..___)/$/ /      /'  /$$%$$%$$$$'         \\");  
    System.out.println ("     \\    |||||||||||(~-(..___)$/ /  /  /'  /$$$%$$$%$$$            |");  
    System.out.println ("      `-__ \\\\\\\\\\\\\\\\\\\\\\(-.(_____) /  / /'  /$$$$%$$$$$%$             |");  
    System.out.println ("          ~~''''''''''\\-\\.(____) /   /'  /$$$$$%%$$$$$$\\_            /");  
    System.out.println ("                       $|===|||  /'  /$$$$$$$%%%$$$$$( ~         ,'|");  
    System.out.println ("                   __  $|===|%\\/'  /$$$$$$$$$$$%%%%$$|        ,''  |");  
    System.out.println ("                  ///\\ $|===|/'  /$$$$$$%$$$$$$$%%%%$(            /'");  
    System.out.println ("                    \\///\\|===|  /$$$$$$$$$%%$$$$$$%%%%$\\_-._       |");  
    System.out.println ("                     `\\//|===| /$$$$$$$$$$$%%%$$$$$$-~~~    ~      /");  
    System.out.println ("                       `\\|-~~(~~-`$$$$$$$$$%%%///////._       ._  |");  
    System.out.println ("                       (__--~(     ~\\\\\\\\\\\\\\\\\\\\        \\ \\");  
    System.out.println ("                       (__--~~(       \\\\\\\\\\\\\\\\\\|        \\/");  
    System.out.println ("                        (__--~(       ||||||||||||||||||/       _/");  
    System.out.println ("                         (__.--._____//////////////////__..---~~");  
    System.out.println ("                         |   ''''''''           ___,,,,ss$$$%");  
    System.out.println ("                        ,%\\__      __,,,\\sssSS$$$$$$$$$$$$$$%%");  
    System.out.println ("                      ,%%%%$$$$$$$$$$\\;;;;\\$$$$$$$$$$$$$$$$%%%$.");  
    System.out.println ("                     ,%%%%%%$$$$$$$$$$%\\;;;;\\$$$$$$$$$$$$%%%$$$$");  
    System.out.println ("                   ,%%%%%%%%$$$$$$$$$%$$$\\;;;;\\$$$$$$$$$%%$$$$$$,");  
    System.out.println ("                  ,%%%%%%%%%$$$$$$$$%$$$$$$\\;;;;\\$$$$$$%%$$$$$$$$");  
    System.out.println ("                 ,%%%%%%%%%%%$$$$$$%$$$$$$$$$\\;;;;\\$$$%$$$$$$$$$$$");  
    System.out.println ("                 %%%%%%%%%%%%$$$$$$$$$$$$$$$$$$\\;;;$$$$$$$$$$$$$$$");  
    System.out.println ("                   ''==%%%%%%%$$$$$TuaXiong$$$$$$$$$$$$$$$$$$$SV''");  
    System.out.println ("                               $$$$$$$$$$$$$$$$$$$$===='''''");  
    System.out.println ("                                 '''''''''~~~~");  
//Link: http://ascii.co.uk/art/warrior
  }
  public void face ()
  {
    System.out.println ("                         |  ||         __.--._");  
    System.out.println ("                         |  ||      /~~   __.-~\\ _");  
    System.out.println ("                         |  ||  _.-~ / _---._ ~-\\/~\\");  
    System.out.println ("                         |  || // /  /~/  .-  \\  /~-\\");  
    System.out.println ("                         |  ||((( /(/_(.-(-~~~~~-)_/ |");  
    System.out.println ("                         |  || ) (( |_.----~~~~~-._\\ /");  
    System.out.println ("                         |  ||    ) |              \\_|");  
    System.out.println ("                         |  ||     (| =-_   _.-=-  |~)         ,");  
    System.out.println ("                         |  ||      | `~~ |   ~~'  |/~-._-'/'/_,");  
    System.out.println ("                         |  ||       \\    |        /~-.__---~ , ,");  
    System.out.println ("                         |  ||       |   ~-''     || `\\_~~~----~");  
    System.out.println ("                         |  ||_.ssSS$$\\ -====-   / )\\_  ~~--~");  
    System.out.println ("                 ___.----|~~~|%$$$$$$/ \\_    _.-~ /' )$s._");  
  }
  public void diplomat ()
  {
     System.out.println("                                      ");
  System.out.println("                  %%%%%%%%%%%%%%%%%%%% ");
  System.out.println("                %%%%%%%%%%%%%%%%%%%%%%% ");
  System.out.println("               %%% /     %%%%%%%%%%%%%%% ");
  System.out.println("              %%% /        %%%%%%%%%%%%%%");
  System.out.println("               %%/           %%%%%%%%%%%%");
  System.out.println("                / _____        %%%%%%%%%%%");
  System.out.println("               ( (_____ \\     %%%%%%%%%%%%");
  System.out.println("                ) <()_>-'    %%%//_\\\\%%%%");
  System.out.println("               /             %%//\\_//%%%");
  System.out.println("              /                )()//%%%");
  System.out.println("             (___)            (.__/%%%");
  System.out.println("               %%%%%           : | %%%");
  System.out.println("               \\__\\ %            /  |");
  System.out.println("               (__/  %          /   |");
  System.out.println("                 %%  %%        /    |");
  System.out.println("                %%%%%%%       /     |");
  System.out.println("               %%%%%%%------'` ");
  };

          
/*
 * This is the court method. I wanted it to be random, but since it is a method and we couldn't have any global variables, i was
 * forced to ask the user for which court case they wanted to see. I do however have loops for incorrect court case numbers
 * I tried to match criteria b perfectly: there is a range of values for every court case, and you gain points for completing the cases
 * there are loops to handle inappropiate inputs
 * I did however take away the deduction of points for incorrect cases-It felt to harsh and I needed to keep the game under 10-15 minutes
 * */
  public void court()
  {
    printSlow ("\n\n Please enter a number from 1-3. If you have already played this mode, try to enter a different number then last time");
    int math=IBIO.inputInt ("Please enter a number>> ");
    if (math<1||math>3)
    {
      JOptionPane.showMessageDialog(null, "Please enter a valid answer");
      math=IBIO.inputInt ("Please enter a number>> ");
    }
    switch (math) {
      case 1: math=1;
      {
        waiting (3,"Loading Case");
        printSlow ( "A soldier has stolen and eaten 10 hens from his neighbour, a farmer.");
        printSlow ("The Farmer is fairly well off-He has 10 farms that he owns");
        printSlow ("The region that this occured in was Rohan-the soldiers are fed very poorly there \n The soldiers family would have died had he not stolen the hens");
        printSlow ("\n Your options: \n D-Death Sentance \n F-Fine \n T-Time spent in prison");
        char choice=IBIO.inputChar ("Your choice? (D/F/T)? ");
         if (choice!='D'&&choice!='d'&&choice!='f'&&choice!='F'&&choice!='t')
         {
           JOptionPane.showMessageDialog(null, "Please enter a valid answer");
           choice=IBIO.inputChar ("Your choice? (D/F/T)? ");
         }
         else if (choice=='D'||choice=='d')
         {
           printSlow ("You choose to kill an honest man over the death of 5 hens?");
           printSlow ("The people are losing their trust in you...");
           space ();
            Try ();
           waiting (3,"Returning to interactions Panel");
           interactionsPanel ();
         }
        else if (choice=='f'||choice=='F')
        {
          int hen=IBIO.inputInt ("How many hens should the soldier pay back? ");
          if (hen<10)
          {
            printSlow ("Correct Answer!! Both sides agree with you. \n Justice is served");
            point++;
            waiting (3,"Returning to interactions panel");
              interactionsPanel ();
          }
          else 
          {
            printSlow ("The soldier was starving.... He cannot afford to pay back such a high number");
            printSlow ("The rich are happy, but the poor are in despair");
            space ();
            Try ();
            waiting (3,"Returning to interactions panel");
              interactionsPanel ();
          }
        }
        else {
          printSlow ("The people have begun to lose their trust in you. Imprisoning a man for saving his family??");
            space ();
            Try ();
            waiting (3,"Returning to interactions panel");
              interactionsPanel ();
        }
        break;
      }
      case 2: math=2;
      {
        waiting (3,"Loading Case");
        printSlow ( "A thief had robbed the National Treasury, Stealing 40% of all the money and gold owned by the government");
        printSlow ("The thief was a former minister of the State; \n After questioning him, it was discovered that he was in fact working for Kandahar\n This is an act of treason");
        printSlow ("\n Your options: \n D-Death Sentance \n F-Fine \n T-Time spent in prison");
        char choice=IBIO.inputChar ("Your choice? (D/F/T)? ");
         if (choice!='D'&&choice!='d'&&choice!='f'&&choice!='F'&&choice!='t')
         {
           JOptionPane.showMessageDialog(null, "Please enter a valid answer");
           choice=IBIO.inputChar ("Your choice? (D/F/T)? ");
         }
         else if (choice=='D'||choice=='d')
         {
           printSlow ("By rewarding treason with death, you make an example of this one case \n Now future betrayers will be less inclined to act");
           printSlow ("It was the right decision");
           point++;
           waiting (4,"Hanging a Traiter and Returning to interactions Panel");
           interactionsPanel ();
         }
        else if (choice=='f'||choice=='F')
        {
          int hen=IBIO.inputInt ("How much should the traiter pay back? (0-X amount% of the loot)>> ");
          //I used ibio, because it had to seem authenthic, but the actual value of the fine doesnt matter-the thought itself was wrong
          printSlow ("\n By only charging a fee, you are sending a message to future traiters \n that nothing of consequence will happen to them");
          printSlow ("And you have to consider that this man is a traiter, he flee to Kandahar to escape");
          causeSlow ("","",1000);
            space ();
            Try ();
            waiting (3,"Returning to interactions panel");
              interactionsPanel ();
          }
        else  {
          int prison=IBIO.inputInt ("How many years should the traiter spend in prison? ");
          if (prison<25)
          {
          printSlow ("Now in 25 years he will get out and return to his life of crime");
          printSlow ("You have made a poor representation of justice in your nation");
          causeSlow ("","",1000);
            space ();
            Try ();
            waiting (3,"Returning to interactions panel");
            interactionsPanel ();}
        
        else
        {
          printSlow ("You have essentially givin him a life sentance of life in prison-\n You appear just to your people as just \n niether oppressive or soft\n");
          printSlow ("You have upheld the law");
          printSlow ("Quest suceeded");
          point++;
          waiting (4,"Sending a man to prison and returning to the interactions panel");
        }
        break;
        }
      }
      case 3: math=3;
      {
        waiting (3,"Loading Case");
        printSlow ( "A man was found to be guilty of the murder of his entire household of 6 people. ");
        printSlow ("Supposedly after hearing that his wife planed to abandon him, \nHe took it upon himself to kill his Father in Law, Mother in Law, and 4 witnesses who were in the house at the time\n");
        printSlow ("\n Your options: \n D-Death Sentance \n F-Fine \n T-Time spent in prison");
        char choice=IBIO.inputChar ("Your choice? (D/F/T)? ");
         if (choice!='D'&&choice!='d'&&choice!='f'&&choice!='F'&&choice!='t')
         {
           JOptionPane.showMessageDialog(null, "Please enter a valid answer");
           choice=IBIO.inputChar ("Your choice? (D/F/T)? ");
         }
         else if (choice=='D'||choice=='d')
         {
           printSlow ("An animal like this one needs to be put one");
           printSlow ("It was the right decision");
           point++;
           waiting (4,"Hanging a Animal and Returning to interactions Panel");
           interactionsPanel ();
         }
        else if (choice=='f'||choice=='F')
        {
          int hen=IBIO.inputInt ("How much should the murder pay? ($0-X)>> ");
          
          //I used ibio, because it had to seem authenthic, but the actual value of the fine doesnt matter-the thought itself was wrong
          printSlow ("\n By only charging a fee, you are sending a message to future murderes \n that nothing of consequence will happen to them");
          printSlow ("They will simply pay a fine and be off scott free");
          causeSlow ("","",1000);
            space ();
            Try ();
            waiting (3,"Returning to interactions panel");
              interactionsPanel ();
          }
        else  {
          int prison=IBIO.inputInt ("How many years should the traiter spend in prison? ");
          if (prison<25)
          {
          printSlow ("Now in 25 years he will get out and return to his life of crime");
          printSlow ("You have made a poor representation of justice in your nation");
          causeSlow ("","",1000);
            space ();
            Try ();
            waiting (3,"Returning to interactions panel");
            interactionsPanel ();}
        
        else
        {
          printSlow ("You have essentially givin him a life sentance of life in prison-\n You appear just to your people as just \n niether oppressive or soft\n");
          printSlow ("You have upheld the law");
          point++;
          printSlow ("Quest suceeded");
          waiting (4,"Sending a man to prison and returning to the interactions panel");
          interactionsPanel ();
        }
        break;
      }
      }
      
    }
  }
  //I used this for cases where the game needed to pause for a second or 2
  public void causeSlow (String c, String x, int speeed)
  {
    System.out.println (c);
    try
    {
      Thread.sleep (speeed);
    }
    catch (InterruptedException m)
    {
      ;
    }
    System.out.println (x);
  }
  //Boss level, links to the actual fight (void war)
  //I did take away the famine however, it felt to unnecesary and like I was throwing in a crisis for no reason
  //Did not feel like my game
  //Instead I put the famine portions of the game into other methods (namely the tax method)
  //This way the player still learns about the issue (famine), but the game is still enjoyable
  public void endGame ()
  {
    System.out.println(" ______   _______  _______  _______        _        _______           _______  _        _______   ");
  System.out.println("(  ___ \\ (  ___  )(  ____ \\(  ____ \\      ( \\      (  ____ \\|\\     /|(  ____ \\( \\      (  ____ \\  ");
  System.out.println("| (   ) )| (   ) || (    \\/| (    \\/      | (      | (    \\/| )   ( || (    \\/| (      | (    \\/  ");
  System.out.println("| (__/ / | |   | || (_____ | (_____       | |      | (__    | |   | || (__    | |      | (_____   ");
  System.out.println("|  __ (  | |   | |(_____  )(_____  )      | |      |  __)   ( (   ) )|  __)   | |      (_____  )  ");
  System.out.println("| (  \\ \\ | |   | |      ) |      ) |      | |      | (       \\ \\_/ / | (      | |            ) |  ");
  System.out.println("| )___) )| (___) |/\\____) |/\\____) |      | (____/\\| (____/\\  \\   /  | (____/\\| (____/\\/\\____) |  ");
  System.out.println("|/ \\___/ (_______)\\_______)\\_______)      (_______/(_______/   \\_/   (_______/(_______/\\_______)  ");
  System.out.println("                                                                                                  ");
    printSlow ("Genghis Khan has finally declared war on you!!");
    System.out.println ("                           ,-.^._                 _");
    System.out.println ("           Dragons Den    .'      `-.            ,' ;");
    System.out.println ("                /o`-. ,----'         `-.   _  ,-.,'  `");
    System.out.println ("             _.'   `--'   |              `-' '-'      ;");
    System.out.println ("The         :              |                          ;    __,-.");
    System.out.println ("End         ,'             |    Mazar-i-Sharif       ;_,-',.__'--.");
    System.out.println ("Of         :    INMELIUS    |                          ,--```    `--'");
    System.out.println ("The        :                 |      ________________ ;             The Sea of ");
    System.out.println ("World      :                | _____|                :                    Pirates    ");
    System.out.println ("           ;      o        |                      :                   |    |    |");
    System.out.println ("          (     Chromata    |                      o;                 )_)  )_)  )_)");
    System.out.println ("           `-.              |                    ,'Pirates Bay       )___))___))___)\\");
    System.out.println ("             ; Army  oHere   |          Kabul   :                   _____|____|____\\\\__");
    System.out.println ("           .'_________________|_____________.-._,'         ---------\\                  /---------");
    System.out.println ("         .'           oKandahar's           `.                  ^^^^^ ^^^^^^^^^^^^^^^^^^^^^");
    System.out.println ("      _.'      o           Army          .__;");
    System.out.println ("      `._       Mordor                  ;");
    System.out.println ("         `.             Kandahar       :    ,------------------------.");
    System.out.println ("           `.               ,..__,---._;    | The Kingdoms of Fear   |");
    System.out.println ("             `-.__         :                |                        |");
    System.out.println ("                  `.--.____;      Gr        | Pop: 20,150,000 (2009) |");
    System.out.println ("                                            | Area: 251,772 sq.mi.   |");
    System.out.println ("                                            |      (652,086 sq.km.)  |");
    System.out.println ("                                            `------------------------'");
    printSlow ("Enemy troops have begun to gather at the border");
    printSlow ("Our spies report that there is an estimated 1 million soldiers located there");
    printSlow ("This includes 500,000 foot soldiers, 200,000 Archers and 200,000 horse riders");
    printSlow ("Most distrubing is the fact that Khan has learned the zombie spell");
    printSlow ("When all of his 1 type of soldiers die, they are replaced by the undead \n The zombies are able to attack, but do not take any damage and will self destruct after the war is over");
    printSlow ("You best bet is to not target that troop, and simply defeat the rest of his army. The zombies will die once you win");
    printSlow ("We have been able to gather 700,000 foot soldiers, 100,000 Archers and 100,000 Horse riders");
    printSlow ("Most of these soldiers come from RhUn");
    space ();
    Fight();
    war ();
    
    
  }
  //Actual Fight method
  //Note the code is very hard to understand, however i did try to shorten it
  //It was really complicated to balance 3 health bars (making the computer target a differnt troop when one would die took me nearly 3 hours)
  //ALso had to make the player vastly stronger then the enemy-otherwise it would take forever
  //I did remove the 1v1 with genghis khan however
  //Made the game too long
  public void war ()
  {
    int efSoldiers=600000;
    int eArchers=200000;
   int  ehRiders=200000;
   int fSoldiers=500000;
   int  hRiders=200000;
   int Archers=200000;
    space ();
    Fight ();
    causeSlow ("","",1000);
    int eHealth=efSoldiers+eArchers+ehRiders;
    int Health=fSoldiers+Archers+hRiders;
    do  {
System.out.println ("Your armies Stats                                                                                      Kandahar's Army Stats");
 //Soldier health bars
      System.out.print (" ");
        System.out.print ("___________________________________________________________");
      System.out.print ("                                        ");
        System.out.print ("__________________________________________________________");
      System.out.print ("\n|Soldiers:");
      for (int man=0;man<fSoldiers/10000;man++)
      {
        System.out.print ("|");
      }
       for (int mut=0; mut<=39+(50-fSoldiers/10000);mut++)
      {
        System.out.print (" ");
      }
      System.out.print ("|Soldier:");
      
      for (int lol=0; lol<efSoldiers/12000; lol++)
      {
        System.out.print ("|");
      }
      System.out.println ("  ");
  System.out.print (" ");
        System.out.print ("-----------------------------------------------------------");
      System.out.print ("                                        ");
        System.out.print ("----------------------------------------------------------");
      System.out.println ("  ");
      //                                                                                    Start of Archer healthbar
     System.out.print (" ");
        System.out.print ("____________________________");
      System.out.print ("                                                                       ");
 System.out.print ("____________________________");

      System.out.print ("\n|Archers:");
      for (int man=0;man<Archers/10000;man++)
      {
        System.out.print ("|");
      }
        for (int mut=0; mut<=70+(20-Archers/10000);mut++)
      {
        System.out.print (" ");
      }
      System.out.print ("|Archers:");
                                                                       
      for (int lol=0; lol<eArchers/10000; lol++)
      {
        System.out.print ("|");
      }
      System.out.println ("  ");
  System.out.print (" ");
        System.out.print ("----------------------------");
      System.out.print ("                                                                       ");
        System.out.print ("-----------------------------");
      System.out.println ("  ");
      //                                                                                                                   Start of Horsemen healthbars
       System.out.print (" ");
System.out.print ("__________________________");
      System.out.print ("                                                                         ");
        System.out.print ("___________________________");
      System.out.print ("\n|Horse:");
      for (int man=0;man<hRiders/10000;man++)
      {
        System.out.print ("|");
      }
      for (int mut=0; mut<73+(20-hRiders/10000);mut++)
      {
        System.out.print (" ");
      }
      System.out.print ("|Horse:");
      for (int lol=0; lol<ehRiders/10000; lol++)
      {
        System.out.print ("|");
      }
      System.out.println ("  ");
  System.out.print (" ");
        System.out.print ("--------------------------");
      System.out.print ("                                                                         ");
       System.out.print ("---------------------------");
      System.out.println (" \n ");
      printSlow1 ("What do you want to do?",10);
      System.out.print (" S-Soldier Attack\n A-Archer Attack \n H-Horse Attack\n ");
      char attack=IBIO.inputChar ("What do you want to do(A/H/S)? ");
      String Soldiers1="Soldiers";
      String Horsemen1="Horsmen";
      String Achers1="Archers";
      if (fSoldiers<=0)
        Soldiers1="Horsemen";
      if (Archers<=0)
       Achers1="Horsemen";
      if (attack!='a'&&attack!='A'&&attack!='h'&&attack!='H'&&attack!='s'&&attack!='S')
      {
        JOptionPane.showMessageDialog(null, "Please enter a valid answer");
        attack=IBIO.inputChar ("What do you want to do(A/H/S)? ");
      }
      else if (attack=='a'||attack=='A')
      {
        printSlow ("Our archers have fired a volley!!!.");
         int fire= (int)(Math.random()*3)+1;
         if (fire==1)
         {
           printSlow ("It is super effective!!! Mostly Soldiers hit.");
if (efSoldiers>0)
           efSoldiers-=350000;
         }
         else if (fire==2)
         {
           printSlow ("It is effective!!! Mostly Soldiers hit.");
if (efSoldiers>0)
               efSoldiers-=250000;
         }
         else 
         {
           printSlow ("Oh no. It is not very effective. Mostly Soldiers hit.");
if (efSoldiers>0)
               efSoldiers-=200000;
             
         }
      }
      else if (attack=='H'||attack=='h')
      {
        printSlow1 ("The horsmen have charged!!!",40);
         int fire= (int)(Math.random()*3)+1;
         if (fire==1)
         {
           printSlow ("It is super effective!!! Mostly horsmen hit");
                        if (ehRiders>0)
               ehRiders-=90000;
         }
         else if (fire==2)
         {
           printSlow ("It is effective!!! Mostly Horsemen hit.");
             if (ehRiders>0)
               ehRiders-=70000;
     
         }
         else 
         {
           printSlow ("Oh no. It is not very effective. Mostly horsemen hit");
             if (ehRiders>0)
               ehRiders-=60000;
         }
      }
      else
      {
        printSlow1 ("The soldiers have charged!!!",40);
         int fire= (int)(Math.random()*3)+1;
         if (fire==1)
         {
           printSlow ("It is super effective!!! Mostly Achers hit.");
             
if (eArchers>0)
           eArchers-=100000;
         }
         else if (fire==2)
         {
           printSlow ("It is effective!!! Mostly Archers hit.");
if (eArchers>0)
               eArchers-=75000;
         }
         else 
         {
           printSlow ("Oh no. It is not very effective. Mostly Archers hit.");
  if (eArchers>0)
                eArchers-=55000;
         }
      }
      int enemyAttack= (int)Math.pow((int)(Math.random()*3)+1,2);
      if (enemyAttack==1)
      {
        System.out.println("");
  System.out.println("                                                        |");
  System.out.println("                                                         \\.");
  System.out.println("                                                         /|.");
  System.out.println("                                                       /  `|.");
  System.out.println("                                                     /     |.");
  System.out.println("                                                   /       |.");
  System.out.println("                                                 /         `|.");
  System.out.println("                                               /            |.");
  System.out.println("                                             /              |.");
  System.out.println("                                           /                |.");
  System.out.println("      __                                 /                  `|.");
  System.out.println("       -\\                              /                     |.");
  System.out.println("         \\\\                          /                       |.");
  System.out.println("           \\\\                      /                         |.");
  System.out.println("            \\|                   /                           |\\");
  System.out.println("              \\#####\\          /                             ||");
  System.out.println("          ==###########>     /                               ||");
  System.out.println("           \\##==      \\    /                                 ||");
  System.out.println("      ______ =       =|__/___                                ||");
  System.out.println("  ,--' ,----`-,__ ___/'  --,-`-==============================##==========>");
  System.out.println(" \\               '        ##_______ ______   ______,--,____,=##,__");
  System.out.println("  `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-/");
  System.out.println("    `-,____,---'       \\####\\              |        ____,--\\_##,/");
  System.out.println("        #_              |##   \\  _____,---==,__,---'         ##");
  System.out.println("         #              ]===--==\\                            ||");
  System.out.println("         #,             ]         \\                          ||");
  System.out.println("          #_            |           \\                        ||");
  System.out.println("           ##_       __/'             \\                      ||");
  System.out.println("            ####='     |                \\                    |/");
  System.out.println("             ###       |                  \\                  |.");
  System.out.println("             ##       _'                    \\                |.");
  System.out.println("            ###=======]                       \\              |.");
  System.out.println("           ///        |                         \\           ,|.");
  System.out.println("           //         |                           \\         |.");
  System.out.println("                                                    \\      ,|.");
  System.out.println("                                                      \\    |.");
  System.out.println("                                                        \\  |.");
         printSlow ("The enemy archers fired a volley!!!.");
         int fire1= (int)(Math.random()*3)+1;
         if (fire1==1)
         {
           printSlow ("It is super effective!!! Mostly "+ Soldiers1 +" hit.");
         if (Soldiers1.equals("Horsemen")||Achers1.equals ("Horsemen"))
               hRiders-=40000;
         else
           fSoldiers-=70000;
         }
         else if (fire1==2)
         {
           printSlow ("It is effective!!! Mostly "+ Soldiers1 +" hit.");
             if (Soldiers1.equals("Horsemen")||Achers1.equals ("Horsemen"))
               hRiders-=30000;
             else
               fSoldiers-=40000;
         }
         else 
         {
           printSlow ("Oh no. It is not very effective. Mostly "+ Horsemen1+ " hit.");
             hRiders-=25000;
         }
      }
         else if (enemyAttack==4)
         {
            System.out.println("             ,;~;,");
  System.out.println("                /\\_");
  System.out.println("               (  /");
  System.out.println(".              ((),     ;,;");
  System.out.println("               |  \\\\  ,;;'(");
  System.out.println("           __ _(  )'~;;'   \\");
  System.out.println("         /'  '\\'()/~' \\ /'\\.)");
  System.out.println("      ,;(      )||     | ");
  System.out.println("     ,;' \\    /-(.;,   )    ");
  System.out.println("          ) /       ) /     ");
  System.out.println("         //         ||  ");
  System.out.println("        (_\\         (_\\                                           ");
 
            printSlow1 ("The enemy horsmen have charged!!!",40);
         int fire2= (int)(Math.random()*3)+1;
         if (fire2==1)
         {
           printSlow ("It is super effective!!! Mostly Archers hit.");
     if (Archers>0)
           Archers-=100000;
         }
         else if (fire2==2)
         {
           printSlow ("It is effective!!! Mostly Archers hit.");
if (Archers>0)
               Archers-=75000;
         }
         else 
         {
           printSlow ("Oh no. It is not very effective. Mostly Archers hit.");
if (Archers>0)
               Archers-=55000;
         }
         }
         
         else
         {
          printSlow1 ("\n\n\n The enemy soldiers have charged!!!",40);
         int fire3= (int)(Math.random()*3)+1;
         if (fire3==1)
         {
           printSlow ("It is super effective!!! Mostly "+ Soldiers1 +" hit.");
         if (Soldiers1.equals("Horsemen")||Achers1.equals ("Horsemen"))
               ehRiders-=40000;
         else
           fSoldiers-=70000;
         }
         else if (fire3==2)
         {
           printSlow ("It is effective!!! Mostly "+ Soldiers1 +" hit.");
             if (Soldiers1.equals("Horsemen")||Achers1.equals ("Horsemen"))
               ehRiders-=250000;
             else
               fSoldiers-=50000;
         }
         else 
         {
           printSlow ("Oh no. It is not very effective. Mostly "+ Achers1 + " hit.");
             if (Soldiers1.equals("Horsemen")||Achers1.equals ("Horsemen"))
               ehRiders-=20000;
             else
               Archers-=15000;
         }
         }
         eHealth=efSoldiers+eArchers+ehRiders;
         Health=fSoldiers+Archers+hRiders;
    } while (Health>0&&eHealth>0);
    
    if (Health<0)
    {
      printSlow ("OH NO. You lost the battle.");
      waiting (3,"Restarting level");
    }
    else 
    {
      space ();
       System.out.println("____   ____.__        __                       ");
  System.out.println("\\   \\ /   /|__| _____/  |_  ___________ ___.__.");
  System.out.println(" \\   Y   / |  |/ ___\\   __\\/  _ \\_  __ <   |  |");
  System.out.println("  \\     /  |  \\  \\___|  | (  <_> )  | \\/\\___  |");
  System.out.println("   \\___/   |__|\\___  >__|  \\____/|__|   / ____|");
  System.out.println("                   \\/                   \\/                              ");
        printSlow1 ("Genghis Khan has been defeated ",30);
        printSlow1 ("Your kingdom is safe!!!!! \n You have won the game!!!!!!!!!!!!",30);
                   }
  }
//Game is over after thsi quest is completed
        
      
      
      
  
    
    
    
  //These games are complety made according to plan
  //Gain points for winning, lose nothing for losing (reason for this provided before)
  public void gambling ()
  {
   printSlow ("Lets play some mini Games\n Your Options: \n G-The Guessing Game\n R-Rock Paper Scissors ");
    char Games=IBIO.inputChar ("What do you want to do(G/R)? ");
    if (Games!='g'&&Games!='g'&&Games!='R'&&Games!='r')
    {
      JOptionPane.showMessageDialog(null, "Please enter a valid answer");
      Games=IBIO.inputChar ("What do you want to do(G/R)? ");
    }
    else if (Games=='r'||Games=='R')
               {
    int cPoint = 0;
    int uPoint = 0;
 
    System.out.println ("-----Rock, Paper, Scissors------\n");
    while ( uPoint <= 10&&cPoint <= 10)
    {
      char user = userChoice ();
      System.out.println ("You have selected " + user);
      char comp = compChoice ();
      System.out.println ("The Gambler has selected " + comp);
      char win = winner (comp, user);
      if (win == 'c')
      {
        cPoint++;
        System.out.println ("\nThe gambler wins!");
      }
      else if (win == 'u')
      {
        uPoint++;
        System.out.println ("\nYou win!");
      }
      else
        System.out.println ("\nThere is a tie!");
      System.out.println ("Points: You: " + uPoint + " Gambler: " + cPoint);
    }
    switch (uPoint)
    {
      case 1: uPoint=10;
      {
        System.out.println ("You won!!!");
        point++;
        break;
      }
      case 2: cPoint=10;
      {
        System.out.println ("You lost +()");
        break;
      }
    }
    face ();
    printSlow ("\n Well that was fun");
    waiting (3,"Returning to interactions Panel");
      interactionsPanel ();
    }
             else 
             {
                 System.out.println (" \n\n The computer has picked a number between 1 and 100. \n try to guess it");
     int i= (int)(Math.random()*100)+1;
    int guess = -1;
    int h = 0;
       while (guess != i)
       {
         
         h++;
      guess=IBIO.inputInt (" Guess "+h+"? ");
      if (guess==i)
        {
        System.out.println ("You got it");
        System.out.println (" It only took "+h+" tries") ;
      }
      else if (guess<i)
        System.out.println ("That is too small");
      else if (guess>i)
        System.out.println ("That is too big");
      
       }
        face ();
    printSlow ("\n Well that was fun.");
       waiting (3,"Returning to interactions Panel");
       point++;
       interactionsPanel ();
             }
  }
  public void Fight ()
  {
    System.out.println(" _______ _________ _______          _________");
    System.out.println("(  ____ \\\\__   __/(  ____ \\|\\     /|\\__   __/");
    System.out.println("| (    \\/   ) (   | (    \\/| )   ( |   ) (   ");
    System.out.println("| (__       | |   | |      | (___) |   | |   ");
    System.out.println("|  __)      | |   | | ____ |  ___  |   | |   ");
    System.out.println("| (         | |   | | \\_  )| (   ) |   | |   ");
    System.out.println("| )      ___) (___| (___) || )   ( |   | |   ");
    System.out.println("|/       \\_______/(_______)|/     \\|   )_(   ");
  }
  //Fight between dragon and the player
  public void fightAct ()
    {
      System.out.println("                                                                                      `\"\"*$b..");
      System.out.println("                                                                                           \"\"*$o.");
      System.out.println("                                                                                               \"$$o.");
      System.out.println("                                                                                                 \"*$$o.");
      System.out.println("                                                                                                    \"$$$o.");
      System.out.println("                                                                                                      \"$$$$bo...       ..o:");
      System.out.println("                                                                                                        \"$$$$$$$$booocS$$$    ..    ,.");
      System.out.println("                                                                                                     \".    \"*$$$$SP     V$o..o$$. .$$$b");
      System.out.println("                                                                                                      \"$$o. .$$$$$o. ...A$$$$$$$$$$$$$$b          ");
      System.out.println("                                                                                                \"\"bo.   \"*$$$$$$$$$$$$$$$$$$$$P*$$$$$$$$:");
      System.out.println("                                                                                                   \"$$.    V$$$$$$$$$P\"**\"\"*\"'   VP  * \"l");
      System.out.println("                                                                                                     \"$$$o.4$$$$$$$$X");
      System.out.println("                                                                                                      \"*$$$$$$$$$$$$$AoA$o..oooooo..           .b");
      System.out.println(",/|\\                                                                                                       .X$$$$$$$$$$$P\"\"     \"\"*oo,,     ,$P");
      System.out.println("//&')                                                                                                       $$P\"\"V$$$$$$$:    .        \"\"*****\"");
      System.out.println("'')(                                                            VS                                        .*\"    A$$$$$$$$o.4;      .");
      System.out.println("(( )                                                                                                           .oP\"\"   \"$$$$$$b.  .$;");
      System.out.println(")( (                                                                                                                    A$$$$$$$$$$P");
      System.out.println("(=M=[)###########>                                                                                                    \"  \"$$$$$P\"");
      System.out.println("(( )                                                                                                                        $$P*\"");
      System.out.println("(( )_                                                                                                                      .$\"");
      System.out.println("((__,)                                                                                                                     \"");
      System.out.println ("");
      System.out.println ("Bob's Stats                                                                                      Dragons Stats");
      int health=500;
      System.out.print (" ");
      for (int mut=0;mut<500/10+7;mut++)
      {
        System.out.print ("_");
      }
      System.out.print ("                                        ");
      for (int mut=0;mut<500/10+7;mut++)
      {
        System.out.print ("_");
      }
      System.out.print ("\n|Health:");
      for (int man=0;man<health/10;man++)
      {
        System.out.print ("|");
      }
      System.out.print ("                                        |Health:");
      int DragonsHealth=1000;
      for (int lol=0; lol<DragonsHealth/20; lol++)
      {
        System.out.print ("|");
      }
      System.out.println ("  ");
  System.out.print (" ");
      for (int mut=0;mut<500/10+7;mut++)
      {
        System.out.print ("-");
      }
      System.out.print ("                                        ");
      for (int mut=0;mut<500/10+7;mut++)
      {
        System.out.print ("-");
      }
      System.out.println ("  ");
      System.out.println ("");
      printSlow1 ("Your Options:",30);
      System.out.println (" A-Attack \n S-Use a Spell");
      while (health>0&&DragonsHealth>0)
      {
        int randome=0;
        char fot='k';
        while (fot!='A'&&fot!='a'&&fot!='s'&&fot!='S')
        {
          fot=IBIO.inputChar ("What do you want to do?(A/S)? ");
          if (fot=='A'||fot=='a')
          {
            causeSlow ("","",500);
            printSlow1 ("You used Attack!",40);
            randome=(int)(Math.random()*3)+1;
            if (randome==1)
            {
              printSlow1 ("It was extremely effective!!!!",40);
              DragonsHealth-=200;
            }
            else if (randome==2)
            {
              printSlow1 ("Oh no. It was not very effective",40);
              DragonsHealth-=100;
            }
            else if (randome==3)
              printSlow1 ("The Dragon dodged the attack. 0 damage dealt",40);
          }
          else if (fot=='B'||fot=='b')
          {
          }
          else if (fot=='s'||fot=='S')
          {
            printSlow1 ("Your options:", 40);
            System.out.println (" F-Fire Attack\n W-Water attack\n E-Earth Attack \n A-Air attack");
            char spell='n';
            while (spell!='f'&&spell!='F'&&spell!='w'&&spell!='W'&&spell!='e'&&spell!='E'&&spell!='a'&&spell!='A')
            {
              spell=IBIO.inputChar ("Which Spell will you cast? (F/W/E/A)>> ");
              if (spell=='f'||spell=='F')
              {
                printSlow1 ("You used the Fire spell",40);
                printSlow1 ("It is not very effective", 40);
                DragonsHealth-=30;
              }
              else if (spell=='w'||spell=='W')
              {
                printSlow1 ("You used the Water spell",40);
                printSlow1 ("It was extremely effective!!!",40);
                DragonsHealth-=200;
              }
              else if (spell=='e'||spell=='E')
                         {
                printSlow1 ("You used the Earth spell",40);
                  printSlow1 ("It is effective",40);
                  DragonsHealth-=150;
              }
              else if (spell=='a'||spell=='A')
                         {
                printSlow1 ("You used the Air Spell", 40);
                printSlow1 ("It is not very effective", 40);
                DragonsHealth-=50;
              }
              else
                JOptionPane.showMessageDialog(null, "Please enter a valid answer");
            }
          }
            else 
              JOptionPane.showMessageDialog(null, "Please enter a valid answer");
          }
        if (DragonsHealth>0)
        {
          spaceHalf ();
          int dragonAttack=(int)(Math.random ()*4)+1;
          if (dragonAttack==1)
          {
            System.out.println("<~>");
  System.out.println(" \\ \\,_____");
  System.out.println("       ___`\\ ");
  System.out.println("       \\('>\\`-__ ");
  System.out.println("         ~      ~~~--__            **              ***");
  System.out.println("               ______  (@\\   *******  ****    *******    ******");
  System.out.println("              /******~~~~\\|**********************************");
  System.out.println("      \\       `--____******************************************");
  System.out.println("     / ~~~--_____    ~~~/ ***************************************  ");
  System.out.println("                 `~~~~~         ******************************");
  System.out.println("                                      ****    **************");
            printSlow1 ("The dragon used Fire Breath",40);
            printSlow1 ("It is extremely effective", 40);
            health-=100;
          }
          else if (dragonAttack==2)
          {
          printSlow1 ("The Dragon used tail whip", 40);
          int Attack=(int)(Math.random ()*4)+1;
          if (Attack==1)
          {
          printSlow1 ("It is extremely effective!!!", 50);
          health-=150;
          }
          else
            printSlow1 ("You dodged the attack!!!\n No damage was done", 40);
          }
          else if (dragonAttack==3)
          {
            printSlow1 ("The Dragon used Bite", 40);
            int Attackk=(int)(Math.random ()*4)+1;
            if (Attackk==1)
            {
              printSlow1 ("It was exetremely effective!!!",40);
              health-=150;
            }
            else
            {
              printSlow1 ("You dodged the attack\n No damage Delt ", 40);
            }
          }
          else 
          {
            System.out.println("     |\\                                                              /|");
  System.out.println("     | \\                                                            / |");
  System.out.println("     |  \\                                                          /  |");
  System.out.println("     |   \\                                                        /   |");
  System.out.println("     |    \\                                                      /    |");
  System.out.println("_____)     \\                                                    /     (____");
  System.out.println("\\           \\                                                  /          /");
  System.out.println(" \\           \\                                                /          /");
  System.out.println("  \\           `--_____                                _____--'          /");
  System.out.println("   \\                  \\                              /                 /");
  System.out.println("____)                  \\                            /                 (____");
  System.out.println("\\                       \\        /|      |\\        /                      /");
  System.out.println(" \\                       \\      | /      \\ |      /                      /");
  System.out.println("  \\                       \\     ||        ||     /                      /");
  System.out.println("   \\                       \\    | \\______/ |    /                      /");
  System.out.println("    \\                       \\  / \\        / \\  /                      /");
  System.out.println("    /                        \\| (*\\  \\/  /*) |/                       \\");
  System.out.println("   /                          \\   \\| \\/ |/   /                         \\");
  System.out.println("  /                            |   |    |   |                           \\");
  System.out.println(" /                             |\\ _\\____/_ /|                            \\");
  System.out.println("/______                       | | \\)____(/ | |                      ______\\");
  System.out.println("       )                      |  \\ |/vv\\| /  |                     (");
  System.out.println("      /                      /    | |  | |    \\                     \\");
  System.out.println("     /                      /     ||\\^^/||     \\                     \\");
  System.out.println("    /                      /     / \\====/ \\     \\                     \\");
  System.out.println("   /_______           ____/      \\________/      \\____           ______\\");
  System.out.println("           )         /   |       |  ____  |       |   \\         (");
  System.out.println("           |       /     |       \\________/       |     \\       |");
  System.out.println("           |     /       |       |  ____  |       |       \\     |");
  System.out.println("           |   /         |       \\________/       |         \\   |");
  System.out.println("           | /            \\      \\ ______ /      /______..    \\ |");
  System.out.println("           /              |      \\\\______//      |        \\     \\");
  System.out.println("                          |       \\ ____ /       |LLLLL/_  \\");
  System.out.println("                          |      / \\____/ \\      |      \\   |");
  System.out.println("                          |     / / \\__/ \\ \\     |     __\\  /__");
  System.out.println("                          |    | |        | |    |     \\      /");
  System.out.println("                          |    | |        | |    |      \\    /");
  System.out.println("                          |    |  \\      /  |    |       \\  /");
  System.out.println("                          |     \\__\\    /__/     |        \\/");
  System.out.println("                         /    ___\\  )  (  /___    \\");
  System.out.println("                        |/\\/\\|    )      (    |/\\/\\|");
  System.out.println("                        ( (  )                (  ) )");
            printSlow1 ("The dragon used charge. It was extremely effective", 40);
            health-=100;
          }
         System.out.print (" ");
      System.out.print ("________________________________________________________");
      System.out.print ("                                        ");
        System.out.print (" ________________________________________________________");
      System.out.print ("\n|Health:");
      for (int man=0;man<health/10;man++)
      {
        System.out.print ("|");
      }
      for (int mut=0; mut<40+(50-health/10);mut++)
      {
        System.out.print (" ");
      }
      System.out.print ("|Health:");
      for (int lol=0; lol<DragonsHealth/20; lol++)
      {
        System.out.print ("|");
      }
      System.out.println ("  ");
     System.out.print (" ---------------------------------------------------------");
      System.out.print ("                                        ");
     System.out.print (" ---------------------------------------------------------");
      System.out.println ("  ");
        
      if (health<=0)
      {
        printSlow1 ("Oh No.You died!!", 40);
        printSlow1 ("Do you want to try again? (Y/N): ",40);
        char bumut=IBIO.inputChar ("What do you want to do? (Y/N)? " );
        if (bumut=='n'||bumut=='N')
          interactionsPanel ();
        else if (bumut=='y'||bumut=='Y')
          fightAct ();
        else 
          JOptionPane.showMessageDialog(null, "Please enter a valid answer");
          
      }
        }
          
      }
       System.out.println("               ,'\\ | |\\");
        System.out.println("               / /.:  ;;");
        System.out.println("              / :'|| //");
        System.out.println("             (| | ||;'");
        System.out.println("             / ||,;'-.._");
        System.out.println("            : ,;,`';:.--`");
        System.out.println("            |:|'`-(\\\\");
        System.out.println("            ::: \\-'\\`'");
        System.out.println("             \\\\\\ \\,-`.");
        System.out.println("              `'\\ `.,-`-._      ,-._");
        System.out.println("       ,-.       \\  `.,-' `-.  / ,..`.");
        System.out.println("      / ,.`.      `.  \\ _.-' \\',: ``\\ \\");
        System.out.println("     / / :..`-'''``-)  `.   _.:''  ''\\ \\");
        System.out.println("    : :  '' `-..''`/    |-''  |''  '' \\ \\");
        System.out.println("    | |  ''   ''  :     |__..-;''  ''  : :");
        System.out.println("    | |  ''   ''  |     ;    / ''  ''  | |");
        System.out.println("    | |  ''   ''  ;    /--../_ ''_ '' _| |");
        System.out.println("    | |  ''  _;:_/    :._  /-.'',-.'',-. | ");
        System.out.println("    : :  '',;'`;/     |_ ,(   `'   `'   \\|");
        System.out.println("     \\ \\  \\(   /\\     :,'  \\");
        System.out.println("      \\ \\.'/  : /    ,)    /");
        System.out.println("       \\ ':   ':    / \\   :");
        System.out.println("        `.\\    :   :\\  \\  |");
        System.out.println("                \\  | `. \\ |..-_");
        System.out.println("                 ) |.  `/___-.-`");
        System.out.println("               ,'  -.'.  `. `'        _,)");
        System.out.println("               \\'\\(`.\\ `._ `-..___..-','");
        System.out.println("                  `'      ``-..___..-'");
        printSlow1 ("The last roars of the mighty dragon!!Smaug is DEAD!!", 40);
        printSlow1 (" Good job, "+ Name,40);
        point+=2;
        loading (3);
        space ();
        
        interactionsPanel ();
      }
  public void history ()
  {
    printSlow ("The left side of Inmelius is only docks and piers, and it is whispered that the gods lay beyond the ocean");
    printSlow ("The capital City is Chromata, and it is where you currenty reside"); 
    printSlow ("Your nation is highly dependent on farming, and as of late your country is in a famine");
    printSlow ("The people have been surviving upon the reserves of food, but it will soon run out");
    printSlow ("They will revolt when it does, but the more pressing matter is Kandahar");
    System.out.println ("\n");
    printSlow ("Kandahar's King, Genghis Khan has been enemies with your father for countless years");
    printSlow ("When the knowledge of Alexanders death spreads, Khan will invade Inmelius");
    printSlow ("You have at best, 3 weeks before the invasion");
    printSlow ("                                             ");
    space ();
  }
  //Whole game revovles around this
  //Alows the user to select which quests he uses
  public void interactionsPanel ()
  {
    if (point>5)
    {
      endGame();
    }
    else {
    printSlow1 ("This is the interactions panel. From here you can chose which quests to undertake. ",30);
    System.out.println ("                         G-Gambling \n                         T-Set Taxes\n                         C-Judge Court Cases\n                         R-Random quest");
    
    char command=IBIO.inputChar ("What do you want to do? (G/T/C/R)>> ");
    if (command=='G'||command=='g')
      gambling();
    else if (command=='C'||command=='c')
    {
      printSlow ("The Judiciary branch is a very important of government. It interprets and applies the law in the name of the state");
      printSlow ("In real life, the judiciary branch does not make the laws, but rather interprets them");
    printSlow ("The judges rulings on cases tell the citizens what is and is not acceptable in life. \n A corrupt court sends a message to citizens that law can be broken without consequences");
      printSlow ("You must make accurate and correct decisions, so that law can be held high in your kingdom");
      court ();
    }
    else if (command=='T'||command=='t')
    {
        printSlow ("In this mode, you get to set the taxes for your country");
    printSlow ("In real life, Taxes are an integral part of life. \n Taxes are major revenue stream of the government, it allows the government to pay for");
      printSlow ("Infrastructure of the state like Roads, hospitals, legal protection, welfare security, environment preservation,  health care, pension funds, welfare, homeland security, war, etc.");
    printSlow ("However, you must consider how much to tax, and who to tax. \n Heavily taxing the poor would lead revolts, it is best to apply the highest taxes on rich");
    printSlow ("You must also consider the fact that there is a famine in the region-Tax to heavily and the people will starve....");
  
      tax ();
    }
    else if (command=='R'||command=='r')
      random ();
    else 
      while (command!='G'&&command!='g'&&command!='t'&&command!='T'&&command!='c'&&command!='C'&&command!='r'&&command!='R')
    {
      JOptionPane.showMessageDialog(null, "Please enter a valid answer");
      command=IBIO.inputChar ("What do you want to do? (G/T/C/R)>> ");
      if (command=='G'||command=='g')
        gambling();
      else if (command=='C'||command=='c')
      {
        printSlow ("The Judiciary branch is a very important of government. It interprets and applies the law in the name of the state");
      printSlow ("In real life, the judiciary branch does not make the laws, but rather interprets them");
    printSlow ("The judges rulings on cases tell the citizens what is and is not acceptable in life. \n A corrupt court sends a message to citizens that law can be broken without consequences");
      printSlow ("You must make accurate and correct decisions, so that law can be held high in your kingdom");
        court ();
      }
      else if (command=='T'||command=='t')
        {
        printSlow ("In this mode, you get to set the taxes for your country");
    printSlow ("In real life, Taxes are an integral part of life. \n Taxes are major revenue stream of the government, it allows the government to pay for");
      printSlow ("Infrastructure of the state like Roads, hospitals, legal protection, welfare security, environment preservation,  health care, pension funds, welfare, homeland security, war, etc.");
    printSlow ("However, you must consider how much to tax, and who to tax. \n Heavily taxing the poor would lead revolts, it is best to apply the highest taxes on rich");
    printSlow ("You must also consider the fact that there is a famine in the region-Tax to heavily and the people will starve....");
  
      tax ();
    }
      else if (command=='R'||command=='r')
        random ();
      
    }
    }  
  }
  //Loading animation
  public void loading (int what)
  {
    for (int i=0; i<what; i++)
    {
      causeSlow ("                                            Loading.","                                            Loading..", 500);
      causeSlow ("                                            Loading...", "                                            Loading..",500);
      
    }
  }
  //Customizable loading animation. Changes what the animation repeats
  public void waiting (int what, String but)
  {
    for (int i=0; i<what; i++)
    {
      causeSlow ("                                            "+but+".","                                            "+but+"..", 500);
      causeSlow ("                                            "+but+"...", "                                            "+but+"..",500);
      
    }
  }
  //PrintSlow, This uses what the user inputed in setting to decide the rate of printing
  //Set to a default value if the user doesnt go to settings
  public void printSlow (String s)
  {
    
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      //sleep for a bit after printing a letter
      try
      {
        Thread.sleep (Speed);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println ();
  }
  //for the moments when i need to print at a certain rate
  public void printSlow1 (String s, int Speeed)
  {
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      //sleep for a bit after printing a letter
      try
      {
        Thread.sleep (Speeed);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println ();
  } 
  //My random quests
  //Mostly for fun
  //Built exactly as planned, points for suceeding
  //
  public void random ()
  {
    printSlow1 ("Here are your options:", 20);
    System.out.println ("S-Slay Smaug \nD-Diplomacy\nH-Hunt the Silent Killer");
    char computer='k';
    while (computer!='s'&&computer!='S'&&computer!='d'&&computer!='D'&&computer!='h'&&computer!='H')
    {
      computer=IBIO.inputChar ("Which Option do you want? (S/D/H)>> ");
      if  (computer=='s'||computer=='S')
      {
        loading(3);
        space ();
        printSlow ("General:Sir, a dragon has taken over the pier of 'Dragons Den'");
        printSlow ("The army has failed to dispatch the Dragon");
        printSlow ("The Villagers are asking for YOU to help them");
        printSlow ("Should you fail, the North will fall to Smaug's Wrath");
        waiting ( 4,"Traveling to Dragens Den");
        space ();
        System.out.println(" ______   _______  _______  _______  _______  _        _______    ______   _______  _       ");
        System.out.println("(  __  \\ (  ____ )(  ___  )(  ____ \\(  ___  )( (    /|(  ____ \\  (  __  \\ (  ____ \\( (    /|");
        System.out.println("| (  \\  )| (    )|| (   ) || (    \\/| (   ) ||  \\  ( || (    \\/  | (  \\  )| (    \\/|  \\  ( |");
        System.out.println("| |   ) || (____)|| (___) || |      | |   | ||   \\ | || (_____   | |   ) || (__    |   \\ | |");
        System.out.println("| |   | ||     __)|  ___  || | ____ | |   | || (\\ \\) |(_____  )  | |   | ||  __)   | (\\ \\) |");
        System.out.println("| |   ) || (\\ (   | (   ) || | \\_  )| |   | || | \\   |      ) |  | |   ) || (      | | \\   |");
        System.out.println("| (__/  )| ) \\ \\__| )   ( || (___) || (___) || )  \\  |/\\____) |  | (__/  )| (____/\\| )  \\  |");
        System.out.println("(______/ |/   \\__/|/     \\|(_______)(_______)|/    )_)\\_______)  (______/ (_______/|/    )_)");
        System.out.println("                                                                                            ");
        printSlow ("Spirit: To enter Dragons Den, you must prove your worth");
        printSlow ("Answer This Riddle: ");
        printSlow ("This thing all things devours;");
        printSlow ("Birds, beasts, trees, flowers;");
        printSlow ("Gnaws iron, bites steel;");
        printSlow ("Grinds hard stones to meal;");
        printSlow ("Slays king, ruins town,");
        printSlow ("And beats mountain down. ");
        String answer=IBIO.inputString ("What is it:? ");
        while (!answer.equalsIgnoreCase ("Time"))
        {
          printSlow ("Hint: Think something that is not a physical object, person, or place)");
          printSlow1 ("Incorrect. Please try again", 30);
          answer=IBIO.inputString ("What is it? ");
        }
        printSlow1 ("Correct. You may pass", 20);
        waiting (2,"Entering Dragens Den");
        space ();
        printSlow1 ("ZzZzzZZZZZzzZZzzZzZz",40);
        printSlow1 ("The Dragon is Asleep", 20);
        System.out.println("                                 (`-..________....---''  ____..._.-`");
        System.out.println("                                  \\\\`._______.._,.---'''     ,'");
        System.out.println("                                  ; )`.      __..-'`-.      /");
        System.out.println("                                 / /     _.-' _,.;;._ `-._,'                     ");
        System.out.println("                  zzzzzz        / /   ,-' _.-'  //   ``--._``._");
        System.out.println("            zzzzzzz            ,','_.-' ,-' _.- (( =-    -. `-._`-._____             ");
        System.out.println("          zzz               ,;.''__..-'   _..--.\\\\.--'````--.._``-.`-._`.");
        System.out.println("       zzz z _          |\\,' .-''        ```-'`---'`-...__,._  ``-.`-.`-.`.");
        System.out.println("  _    _z.-,'(__)\\__)\\-'' `     ___  .          `     \\      `--._");
        System.out.println(",',)---' /|)          `     `      ``-.   `     /     /     `     `-.");
        System.out.println("\\_____--.  '`  `               __..-.  \\     . (   < _...-----..._   `.");
        System.out.println(" \\_,--..__. \\\\ .-`.\\----'';``,..-.__ \\  \\      ,`_. `.,-'`--'`---''`.  )");
        System.out.println("           `.\\`.\\  `_.-..' ,'   _,-..'  /..,-''(, ,' ; ( _______`___..'__");
        System.out.println("                   ((,(,__(    ((,(,__,'  ``'-- `'`.(\\  `.,..______    ");
        causeSlow ("", "", 2500);
        printSlow1 ("The Dragon has seen you!", 20);
          System.out.println("                                                   _");
  System.out.println("                       /                            )");
  System.out.println("                      (                             |\\");
  System.out.println("                     /|                              \\\\");
  System.out.println("                    //                                \\\\");
  System.out.println("                   ///                                 \\|");
  System.out.println("                  /( \\                                  )\\");
  System.out.println("                  \\\\  \\_                               //)");
  System.out.println("                   \\\\  :\\__                           ///");
  System.out.println("                    \\\\     )                         // \\");
  System.out.println("                     \\\\:  /                         // |/");
  System.out.println("                      \\\\ / \\                       //  \\");
  System.out.println("                       /)   \\     ___..-'         ((  \\_|");
  System.out.println("                      //     /  .'  _.'           \\ \\  \\");
  System.out.println("                     /|       \\(  _\\_____          \\ | /");
  System.out.println("                    (| _ _  __/          '-.       ) /.'");
  System.out.println("                     \\\\ .  '-.__ \\          \\_    / / \\");
  System.out.println("                      \\\\_'.     > '-._   '.   \\  / / /");
  System.out.println("                       \\ \\      \\     \\    \\   .' /.'");
  System.out.println("                        \\ \\  '._ /     \\  /   / .' |");
  System.out.println("                         \\ \\_     \\_   |    .'_/ __/");
  System.out.println("                          \\  \\      \\_ |   / /  _/ \\_");
  System.out.println("                           \\  \\       / _.' /  /     \\");
  System.out.println("                           \\   |     /.'   / .'       '-,_");
  System.out.println("                            \\   \\  .'   _.'_/             \\");
  System.out.println("               /\\    /\\      ) ___(    /_.'           \\    |");
  System.out.println("              | _\\__// \\    (.'      _/               |    |");
  System.out.println("              \\/_  __  /--'`    ,                   __/    /");
  System.out.println("              (_ ) /b)  \\  '.   :            \\___.-:_/ \\__/");
  System.out.println("              /:/:  ,     ) :        (      /_.'_/-' |_ _ /");
  System.out.println("             /:/: __/\\ >  __,_.----.__\\    /        (/(/(/");
  System.out.println("            (_(,_/V .'/--'    _/  __/ |   /");
  System.out.println("             VvvV  //`    _.-' _.'     \\   \\");
  System.out.println("               n_n//     (((/->/        |   /");
  System.out.println("               '--'         ~='          \\  |");
  System.out.println("                                          | |_,,,");
  System.out.println("                                          \\  \\  /");
  System.out.println("                                           '.__)");
        causeSlow ("", "", 2500);
        space ();
        Fight ();
        causeSlow ("", "", 1000);
        space ();
        fightAct();
        spaceHalf();
      }
      
      else if (computer=='d'||computer=='D')
      {
        printSlow ("A diplomat from Mazar-i-Sharif is visiting your palace");
        printSlow ("You must convince him to help you in the war against Kandahar");
        printSlow ("If you succeed, Mazar-i-Sharif will provide men for the war effort");
        waiting (2,"Putting on fancy Dress");
        diplomat ();
        printSlow ("Diplomat: It is my honour to be in your presence, King " + Name );
        face ();
        printSlow ("You: It is my honour to welcome such a revered guest");
        printSlow ("Let's play a mini game-The guessing game.\n The amount of tries you take to geuss will determine the course of this meeting");
         int but=0;
          while (but==0)
        {
          but++;
        System.out.println (" The computer has picked a number between 1 and 100. \n try to guess it");
     int i= (int)(Math.random()*100)+1;
    int guess = -1;
    int h = 0;
       while (guess != i)
       {
         
         h++;
      guess=IBIO.inputInt (" Guess "+h+"? ");
      if (guess==i)
        {
        System.out.println ("You got it");
        System.out.println (" It only took "+h+" tries") ;
      }
      else if (guess<i)
        System.out.println ("That is too small");
      else if (guess>i)
        System.out.println ("That is too big");
       }
       if (h>=0&&h<=10)
       {
         diplomat ();
         printSlow ("Lets Get on task, Shall we? On the topic of Mazar-i-Sharif lending soldiers, I do believe that this is feasible");
         printSlow ("While there have been raids for the past few months, I do believe that it is possible to lend 1/4 of our army to you");
         printSlow ("In return, you will have to help us in our times of need");
         face ();
         int cot=0;
         while (cot==0)
         {
         printSlow ("What do you want to do?\n A-Accept their offer \n R-Reject their offer \n C-Come back with a new offer-lend the full army");
         char Answer=IBIO.inputChar ("What do you want to do? (R/C/A)>> ");
         cot++;
                     while (Answer!='R'&&Answer!='r'&&Answer!='a'&&Answer!='A'&&Answer!='c'&&Answer!='C')
            {
              JOptionPane.showMessageDialog(null, "Please enter a valid answer");
              Answer=IBIO.inputChar ("What do you want to do? (R/C/A)>> ");
            }
                     if (Answer=='R'||Answer=='r')
                     {
                       diplomat ();
                       printSlow1 ("How dare you deny our generous offer!! There shall be no aid forthcoming from Inmelius",30);
                       face ();
                       printSlow1 ("Leave this country at once!!-If you want to see another dawn....",30);
                       space ();
                       Try ();
                        printSlow1 ("Do you want to try again? (YES or NO)",40);
                   char choice2=IBIO.inputChar ("What do you want to do(Y/N)? ");
                   while (choice2!='n'&&choice2!='N'&&choice2!='Y'&&choice2!='y')
                   {
                     JOptionPane.showMessageDialog(null, "Please enter a valid answer");
                     choice2=IBIO.inputChar ("What do you want to do(Y/N)? ");
                   }
                   if (choice2=='Y'||choice2=='y')
                 cot=0;
                   else 
      interactionsPanel ();     
                     }
                     else if (Answer=='A'||Answer=='a'){
                       diplomat ();
                     printSlow1 ("That is indeed great news. I shall report this back to my king \n Most likely, you will recieve 100,000 men", 30);
                     face ();
                     printSlow1 ("That is fabulous news indeed. Farewell my friend",30);
                     point++;
         spaceHalf();
         printSlow1 ("Good Job, " +Name,30);
         waiting (3,"Returning to interactions panel");
                       interactionsPanel ();
                     }
                     else
                     {
                      diplomat ();
                       printSlow1 ("How dare you deny our generous offer!! 1/4 of our army is more then enough to CRUSH you AND Kandahar!\n There will no aid forthcoming from us!",30);
                       face ();
                       printSlow1 ("Leave this country at once!!-If you want to see another dawn....",30);
                       space ();
                       Try ();
                        printSlow1 ("Do you want to try again? (YES or NO)",40);
                   char choice2=IBIO.inputChar ("What do you want to do(Y/N)? ");
                   while (choice2!='n'&&choice2!='N'&&choice2!='Y'&&choice2!='y')
                   {
                     JOptionPane.showMessageDialog(null, "Please enter a valid answer");
                     choice2=IBIO.inputChar ("What do you want to do(Y/N)? ");
                   }
                   if (choice2=='Y'||choice2=='y')
                 cot=0;
                   else 
      interactionsPanel ();  
                     }
         }
       }
       
       else {
         diplomat ();
         printSlow ("Lets Get on task, Shall we? On the topic of Mazar-i-Sharif lending soldiers, I do not believe that this is feasible");
        printSlow ("There have been raids in our area by pirates from Kabul recently-we need all the soldiers we can get");
        face ();
        printSlow1 ("That is indeed great grave news. My deepest condolences to your king.",30);
          Try ();
                        printSlow1 ("Do you want to try again? (YES or NO)",40);
                   char choice2=IBIO.inputChar ("What do you want to do(Y/N)? ");
                   while (choice2!='n'&&choice2!='N'&&choice2!='Y'&&choice2!='y')
                   {
                     JOptionPane.showMessageDialog(null, "Please enter a valid answer");
                     choice2=IBIO.inputChar ("What do you want to do(Y/N)? ");
                   }
                   if (choice2=='Y'||choice2=='y')
                 but=0;
                   else 
      interactionsPanel ();  
       }
       }
    
      }
      
      else if (computer=='h'||computer=='H')
      {
        printSlow ("Local Villager: Sir, a murderer has been slaying people in Chromata for the last few days");
        printSlow ("This individual has slain 5 people so far; All the killing were done at night in downtown Chromata");
        printSlow ("The people are losing their trust in the ability of you to protect them");
        printSlow1 ("You must slay him", 30);
        waiting (3, "Puting on Costume");
        space ();
          System.out.println(" _______ _________ _______  _______  _______ _________ _______          ");
          System.out.println("(  ____ \\\\__   __/(  ____ )(  ____ \\(  ____ \\\\__   __/(  ____ \\         ");
          System.out.println("| (    \\/   ) (   | (    )|| (    \\/| (    \\/   ) (   | (    \\/         ");
          System.out.println("| (_____    | |   | (____)|| (__    | (__       | |   | (_____          ");
          System.out.println("(_____  )   | |   |     __)|  __)   |  __)      | |   (_____  )         ");
          System.out.println("      ) |   | |   | (\\ (   | (      | (         | |         ) |         ");
          System.out.println("/\\____) |   | |   | ) \\ \\__| (____/\\| (____/\\   | |   /\\____) |         ");
          System.out.println("\\_______)   )_(   |/   \\__/(_______/(_______/   )_(   \\_______)         ");
          System.out.println("                                                                        ");
          System.out.println("                     _______  _______                                   ");
          System.out.println("                    (  ___  )(  ____ \\                                  ");
          System.out.println("                    | (   ) || (    \\/                                  ");
          System.out.println("                    | |   | || (__                                      ");
          System.out.println("                    | |   | ||  __)                                     ");
          System.out.println("                    | |   | || (                                        ");
          System.out.println("                    | (___) || )                                        ");
          System.out.println("                    (_______)|/                                         ");
          System.out.println("                                                                        ");
          System.out.println(" _______           _______  _______  _______  _______ _________ _______ ");
          System.out.println("(  ____ \\|\\     /|(  ____ )(  ___  )(       )(  ___  )\\__   __/(  ___  )");
          System.out.println("| (    \\/| )   ( || (    )|| (   ) || () () || (   ) |   ) (   | (   ) |");
          System.out.println("| |      | (___) || (____)|| |   | || || || || (___) |   | |   | (___) |");
          System.out.println("| |      |  ___  ||     __)| |   | || |(_)| ||  ___  |   | |   |  ___  |");
          System.out.println("| |      | (   ) || (\\ (   | |   | || |   | || (   ) |   | |   | (   ) |");
          System.out.println("| (____/\\| )   ( || ) \\ \\__| (___) || )   ( || )   ( |   | |   | )   ( |");
          System.out.println("(_______/|/     \\||/   \\__/(_______)|/     \\||/     \\|   )_(   |/     \\|");
          printSlow ("\n\n In order to capture the criminal, you have chosen to roam the streets where the most of killings took place");
          printSlow ("You are dressed as a begger, as all the other previous victims had been beggers");
          waiting (3, "Searching for Murderer");
          int cot= 0;
          while (cot==0)
          {
            cot++;
          printSlow1 ("You spot a suspicious man!!", 30);
          System.out.println("            '-.               .-'");
  System.out.println("_______________'-._________.-'______________");
  System.out.println("'-.           _    '-. .-'   _           .-'");
  System.out.println("   '-.       (_)  /      \\  (_)       .-'");
  System.out.println("      '-.        /        \\        .-'");
  System.out.println("         '-.____/          \\____.-'");
  System.out.println("                \\_ _ _ _ _ /");
  System.out.println("            //////////\\\\\\\\\\\\\\\\\\");
  System.out.println("           ///////////\\\\\\\\\\\\\\\\\\\\");
  System.out.println("          |||| .-----------._||||");
  System.out.println("          |||| '-|___|___|-' ||||");
  System.out.println("          \\\\\\\\  '---------'  ////");
  System.out.println("            \\\\\\|||||||||||||///");
  System.out.println("              \\\\\\\\\\\\\\\\///////");
  System.out.println("                \\\\\\\\\\\\/////         ");
  printSlow ("He was attacking another man with a knife");
    printSlow1 ("DO you... \n S-Save the man \n D-Let him die", 40);
                 char choice=IBIO.inputChar ("What do you want to do? ");
               while (choice!='S'&&choice!='s'&&choice!='d'&&choice!='D')
                 {
                 JOptionPane.showMessageDialog(null, "Please enter a valid answer");
                 choice=IBIO.inputChar ("What do you want to do? ");
               }
               if (choice=='d'||choice=='D')
                     {
                 printSlow1 ("Oh No.... The man died and the suspect ran away.", 40);
                   Try ();
                   printSlow1 ("Do you want to try again?",40);
                   char choice2=IBIO.inputChar ("What do you want to do(Y/N)? ");
                   while (choice2!='n'&&choice2!='N'&&choice2!='Y'&&choice2!='y')
                   {
                     JOptionPane.showMessageDialog(null, "Please enter a valid answer");
                     choice2=IBIO.inputChar ("What do you want to do(Y/N)? ");
                   }
                   if (choice2=='Y'||choice2=='y')
                 cot=0;
                   else 
      interactionsPanel ();         
               }
               }
                 printSlow1 ("You step in and break the fight\n The victim runs away and the suspect turns on you", 40);  
                 System.out.println("            '-.               .-'");
  System.out.println("_______________'-._________.-'______________");
  System.out.println("'-.           _    '-. .-'   _           .-'");
  System.out.println("   '-.       (_)  /      \\  (_)       .-'");
  System.out.println("      '-.        /        \\        .-'");
  System.out.println("         '-.____/          \\____.-'");
  System.out.println("                \\_ _ _ _ _ /");
  System.out.println("            //////////\\\\\\\\\\\\\\\\\\");
  System.out.println("           ///////////\\\\\\\\\\\\\\\\\\\\");
  System.out.println("          |||| .-----------._||||");
  System.out.println("          |||| '-|___|___|-' ||||");
  System.out.println("          \\\\\\\\  '---------'  ////");
  System.out.println("            \\\\\\|||||||||||||///");
  System.out.println("              \\\\\\\\\\\\\\\\///////");
  System.out.println("                \\\\\\\\\\\\/////         ");
  printSlow ("Suspect: HEY BUDDY! WHATS YOUR PROBLEM? \n THAT LOWLIFE DARED TO LOOK AT ME \n HE ONLY GOT WHAT HE DESERVED");
  face ();
  printSlow ("\nYou: You are under arrest for assault!");
        printSlow1 ("The man has ran away!!!", 40);                                
System.out.println ("    (_O_ ");
System.out.println ("      W )");
System.out.println ("    /'\\__");
System.out.println ("   _|     '");
waiting (4, "Running after suspect"); 
printSlow1 ("The Suspect has entered...                               ", 40);
 System.out.println(" ______  _________ _______  _______  _______  _             ");
  System.out.println("(  __  \\ \\__   __/(  ___  )(  ____ \\(  ___  )( (    /|      ");
  System.out.println("| (  \\  )   ) (   | (   ) || (    \\/| (   ) ||  \\  ( |      ");
  System.out.println("| |   ) |   | |   | (___) || |      | |   | ||   \\ | |      ");
  System.out.println("| |   | |   | |   |  ___  || | ____ | |   | || (\\ \\) |      ");
  System.out.println("| |   ) |   | |   | (   ) || | \\_  )| |   | || | \\   |      ");
  System.out.println("| (__/  )___) (___| )   ( || (___) || (___) || )  \\  |      ");
  System.out.println("(______/ \\_______/|/     \\|(_______)(_______)|/    )_)      ");
  System.out.println("                                                            ");
  System.out.println(" _______  _        _        _______                         ");
  System.out.println("(  ___  )( \\      ( \\      (  ____ \\|\\     /|               ");
  System.out.println("| (   ) || (      | (      | (    \\/( \\   / )               ");
  System.out.println("| (___) || |      | |      | (__     \\ (_) /                ");
  System.out.println("|  ___  || |      | |      |  __)     \\   /                 ");
  System.out.println("| (   ) || |      | |      | (         ) (                  ");
  System.out.println("| )   ( || (____/\\| (____/\\| (____/\\   | |   z               ");
  System.out.println("|/     \\|(_______/(_______/(_______/   \\_/                  ");
  System.out.println("                                                            ");
        printSlow1 ("Gatekeeper: In order to pass you must prove your wit", 40);
          System.out.println ("What has roots as nobody sees,");
System.out.println ("Is taller than trees,");
System.out.println ("Up, up it goes,");
System.out.println ("And yet never grows? ");

String riddle=IBIO.inputString ("What is it? ");
 
 while (!riddle.equals ("Mountain")&&!riddle.equals ("MOUNTAIN")&&!riddle.equals ("mountain")&&!riddle.equals ("mountains"))
        {
          printSlow1 ("Incorrect. Please try again", 30);
          riddle=IBIO.inputString ("What is it: >> ");
        }
 printSlow1 ("Correct. You may pass.",30);
  waiting (2, "Entering Diagon ALley");
  printSlow ("You see the suspect!!\n He ran into an abandoned shop");
  waiting (2,"Entering shop");
  space ();
spaceHalf ();
causeSlow ("","",2000);
causeSlow ("HA","", 2000);
       printSlow1 ("Ha.Ha.hAhA.HA",40);
       causeSlow ("","", 2000);
       causeSlow ("Peek A", "BOO",2000);
           System.out.println("                        (");
  System.out.println("                .            )        )");
  System.out.println("                         (  (|              .");
  System.out.println("                     )   )\\/ ( ( (");
  System.out.println("             *  (   ((  /     ))\\))  (  )    )");
  System.out.println("           (     \\   )\\(          |  ))( )  (|");
  System.out.println("           >)     ))/   |          )/  \\((  ) \\");
  System.out.println("           (     (      .        -.     V )/   )(    (");
  System.out.println("            \\   /     .   \\            .       \\))   ))");
  System.out.println("              )(      (  | |   )            .    (  /                     ");
  System.out.println("             )(    ,'))     \\ /          \\( `.    )");
  System.out.println("             (\\>  ,'/__      ))            __`.  /");
  System.out.println("            ( \\   | /  ___   ( \\/     ___   \\ | ( (");
  System.out.println("             \\.)  |/  /   \\__      __/   \\   \\|  ))");
  System.out.println("            .  \\. |>  \\      | __ |      /   <|  /");
  System.out.println("                 )/    \\____/ :..: \\____/     \\ <");
  System.out.println("          )   \\ (|__  .      / ;: \\          __| )  (");
  System.out.println("         ((    )\\)  ~--_     --  --      _--~    /  ))");
  System.out.println("          \\    (    |  ||               ||  |   (  /");
  System.out.println("                \\.  |  ||_             _||  |  /");
  System.out.println("                  > :  |  ~V+-I_I_I-+V~  |  : (.");
  System.out.println("                 (  \\:  T\\   _     _   /T  : ./");
  System.out.println("                  \\  :    T^T T-+-T T^T    ;<");
  System.out.println("                   \\..`_       -+-       _'  )");
  System.out.println("                     . `--=.._____..=--'. ./         ");
  System.out.println("          ");
  
  causeSlow ("","",1000);
  space();
  Fight ();
      System.out.println("                                                                                           (");
      System.out.println("                                                                                   .            )        )");
      System.out.println("                                                                                            (  (|              .");
      System.out.println("                                                                                        )   )\\/ ( ( (");
      System.out.println("                                                                                *  (   ((  /     ))\\))  (  )    )");
      System.out.println("                                                                              (     \\   )\\(          |  ))( )  (|");
      System.out.println("                                                                              >)     ))/   |          )/  \\((  ) \\");
      System.out.println("                                                                              (     (      .        -.     V )/   )(    (");
      System.out.println("                                                                               \\   /     .   \\            .       \\))   ))");
      System.out.println("                                                                                 )(      (  | |   )            .    (  /                     ");
      System.out.println("                                                                                )(    ,'))     \\ /          \\( `.    )");
      System.out.println("                                                                                (\\>  ,'/__      ))            __`.  /");
      System.out.println("                                                                               ( \\   | /  ___   ( \\/     ___   \\ | ( (");
      System.out.println("                                                                                \\.)  |/  /   \\__      __/   \\   \\|  ))");
      System.out.println("                                                                               .  \\. |>  \\      | __ |      /   <|  /");
      System.out.println("                                                                                    )/    \\____/ :..: \\____/     \\ <");
      System.out.println(",/|\\                                                                        )   \\ (|__  .      / ;: \\          __| )  (");
      System.out.println("//&')                                                                       ((    )\\)  ~--_     --  --      _--~    /  ))");
      System.out.println("'')(                                             VS                          \\    (    |  ||               ||  |   (  /");
      System.out.println("(( )                                                                               \\.  |  ||_             _||  |  /");
      System.out.println(")( (                                                                                 > :  |  ~V+-I_I_I-+V~  |  : (.");
      System.out.println("(=M=[)###########>                                                                  (  \\:  T\\   _     _   /T  : ./");
      System.out.println("(( )                                                                                 \\  :    T^T T-+-T T^T    ;<");
      System.out.println("(( )_                                                                                 \\..`_       -+-       _'  )");
      System.out.println("((__,)                                                                                   . `--=.._____..=--'. ./         ");
      System.out.println ("");
      System.out.println ("Bob's Stats                                                                                  Demon's stats");
        
        
        int health=500;
      System.out.print (" ");
      for (int mut=0;mut<500/10+7;mut++)
      {
        System.out.print ("_");
      }
      System.out.print ("                                        ");
      for (int mut=0;mut<500/10+7;mut++)
      {
        System.out.print ("_");
      }
      System.out.print ("\n|Health:");
      for (int man=0;man<health/10;man++)
      {
        System.out.print ("|");
      }
      System.out.print ("                                        |Health:");
      int DragonsHealth=1000;
      for (int lol=0; lol<DragonsHealth/20; lol++)
      {
        System.out.print ("|");
      }
      System.out.println ("  ");
  System.out.print (" ");
      for (int mut=0;mut<500/10+7;mut++)
      {
        System.out.print ("-");
      }
      System.out.print ("                                        ");
      for (int mut=0;mut<500/10+7;mut++)
      {
        System.out.print ("-");
      }
      System.out.println ("  ");
    System.out.println ("");
      printSlow1 ("Your Options:",30);
      System.out.println (" A-Attack \n S-Use a Spell");
      while (health>0&&DragonsHealth>0)
      {
        int randome=0;
        char fot='k';
        while (fot!='A'&&fot!='a'&&fot!='s'&&fot!='S')
        {
          fot=IBIO.inputChar ("What do you want to do?(A/S)>> ");
          if (fot=='A'||fot=='a')
          {
            causeSlow ("","",500);
            printSlow1 ("You used Attack!",40);
            randome=(int)(Math.random()*3)+1;
            if (randome==1)
            {
              printSlow1 ("It was extremely effective!!!!",40);
              DragonsHealth-=200;
            }
            else if (randome==2)
            {
              printSlow1 ("Oh no. It was not very effective",40);
              DragonsHealth-=100;
            }
            else if (randome==3)
              printSlow1 ("The Demon dodged the attack. 0 damage dealt",40);
          }
          else if (fot=='B'||fot=='b')
          {
          }
          else if (fot=='s'||fot=='S')
          {
            printSlow1 ("Your options:", 40);
            System.out.println (" F-Fire Attack\n W-Water attack\n E-Earth Attack \n A-Air attack");
            char spell='n';
            while (spell!='f'&&spell!='F'&&spell!='w'&&spell!='W'&&spell!='e'&&spell!='E'&&spell!='a'&&spell!='A')
            {
              spell=IBIO.inputChar ("Which Spell will you cast? (F/W/E/A)>> ");
              if (spell=='f'||spell=='F')
              {
                printSlow1 ("You used the Fire spell",40);
                printSlow1 ("It is not very effective", 40);
                DragonsHealth-=30;
              }
              else if (spell=='w'||spell=='W')
              {
                printSlow1 ("You used the Water spell",40);
                printSlow1 ("It was extremely effective!!!",40);
                DragonsHealth-=200;
              }
              else if (spell=='e'||spell=='E')
                         {
                printSlow1 ("You used the Earth spell",40);
                  printSlow1 ("It is effective",40);
                  DragonsHealth-=150;
              }
              else if (spell=='a'||spell=='A')
                         {
                printSlow1 ("You used the Air Spell", 40);
                printSlow1 ("It is extremely effective", 40);
                DragonsHealth-=100;
              }
              else
                JOptionPane.showMessageDialog(null, "Please enter a valid answer");
            }
          }
            else 
              JOptionPane.showMessageDialog(null, "Please enter a valid answer");
          }
        if (DragonsHealth>0)
        {
          spaceHalf ();
          int dragonAttack=(int)(Math.random ()*4)+1;
          if (dragonAttack==1)
          {
            printSlow1 ("The ghost used Fire Breath",40);
            printSlow1 ("It is extremely effective", 40);
            health-=100;
          }
          else if (dragonAttack==2)
          {
             System.out.println("                 _________-----_____");
  System.out.println("       _____------           __      ----_");
  System.out.println("___----             ___------              \\");
  System.out.println("   ----________        ----                 \\");
  System.out.println("               -----__    |             _____)");
  System.out.println("                    __-                /     \\");
  System.out.println("        _______-----    ___--          \\    /)\\");
  System.out.println("  ------_______      ---____            \\__/  /");
  System.out.println("               -----__    \\ --    _          /\\");
  System.out.println("                      --__--__     \\_____/   \\_/\\");
  System.out.println("                              ----|   /          |");
  System.out.println("                                  |  |___________|");
  System.out.println("                                  |  | ((_(_)| )_)");
  System.out.println("                                  |  \\_((_(_)|/(_)");
  System.out.println("                                  \\             (");
  System.out.println("                                   \\_____________)");
          printSlow1 ("The demon lunged at you!!!", 40);
          int Attack=(int)(Math.random ()*4)+1;
          if (Attack==1)
          {
          printSlow1 ("It is extremely effective!!!", 50);
          health-=150;
          }
          else
            printSlow1 ("You dodged the attack!!!\n No damage was done", 40);
          }
          else if (dragonAttack==3)
          {
  System.out.println("                      ,,ggddY\"\"\"\"Ybbgg,,");
  System.out.println("                 ,agd\"\"'              `\"\"bg,");
  System.out.println("              ,gdP\"                       \"Ybg,");
  System.out.println("            ,dP\"                             \"Yb,");
  System.out.println("          ,dP\"         _,,ddP\"\"\"Ybb,,_         \"Yb,");
  System.out.println("         ,8\"         ,dP\"'         `\"Yb,         \"8,");
  System.out.println("        ,8'        ,d\"                 \"b,        `8,");
  System.out.println("       ,8'        d\"                     \"b        `8,");
  System.out.println("       d'        d'        ,gPPRg,        `b        `b");
  System.out.println("       8         8        dP'   `Yb        8         8");
  System.out.println("       8         8        8)     (8        8         8");
  System.out.println("       8         8        Yb     dP        8         8");
  System.out.println("       8         Y,        \"8ggg8\"        ,P         8");
  System.out.println("       Y,         Ya                     aP         ,P");
  System.out.println("       `8,         \"Ya                 aP\"         ,8'");
  System.out.println("        `8,          \"Yb,_         _,dP\"          ,8'");
  System.out.println("         `8a           `\"\"YbbgggddP\"\"'           a8'");
  System.out.println("          `Yba                                 adP'");
  System.out.println("            \"Yba                             adY\"");
  System.out.println("              `\"Yba,                     ,adP\"'");
  System.out.println("                 `\"Y8ba,             ,ad8P\"'");
  System.out.println("                      ``\"\"YYbaaadPP\"\"''");
  System.out.println("");
            printSlow1 ("The Demon used HEll HOLE", 40);
            int Attackk=(int)(Math.random ()*4)+1;
            if (Attackk==1)
            {
              printSlow1 ("It was exetremely effective!!!",40);
              health-=150;
            }
            else
            {
              printSlow1 ("You dodged the attack\n No damage Delt ", 40);
            }
          }
          else 
          {
            System.out.println("     |\\                                                              /|");
            printSlow1 ("The Demon used death scream. It was extremely effective", 40);
            health-=100;
          }
         System.out.print (" ");
      System.out.print ("________________________________________________________");
      System.out.print ("                                        ");
        System.out.print (" ________________________________________________________");
      System.out.print ("\n|Health:");
      for (int man=0;man<health/10;man++)
      {
        System.out.print ("|");
      }
      for (int mut=0; mut<40+(50-health/10);mut++)
      {
        System.out.print (" ");
      }
      System.out.print ("|Health:");
      for (int lol=0; lol<DragonsHealth/20; lol++)
      {
        System.out.print ("|");
      }
      System.out.println ("  ");
     System.out.print (" ---------------------------------------------------------");
      System.out.print ("                                        ");
     System.out.print (" ---------------------------------------------------------");
      System.out.println ("  ");
        
      if (health<=0)
      {
        printSlow1 ("Oh No.You died!!", 40);
        printSlow1 ("Do you want to try again? (Y/N): ",40);
        char bumut=IBIO.inputChar ("What do you want to do? (Y/N)>> " );
        if (bumut=='n'||bumut=='N')
          interactionsPanel ();
        else if (bumut=='y'||bumut=='Y')
          fightAct ();
        else 
          JOptionPane.showMessageDialog(null, "Please enter a valid answer");   
      }
        }
      }
       System.out.println("                       uuuuuuuuuuuuuuuuuuuuu.");
  System.out.println("                   .u$$$$$$$$$$$$$$$$$$$$$$$$$$W.");
  System.out.println("               $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$i");
  System.out.println("              $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  System.out.println("           .i$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$i");
  System.out.println("           $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$W");
  System.out.println("         .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$i");
  System.out.println("         #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.");
  System.out.println("$u       #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$~");
  System.out.println("$#      `\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  System.out.println("$$         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  System.out.println(" $$      $iW$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$!");
  System.out.println(" $$i      $$$$$$$#\"\" `\"\"\"#$$$$$$$$$$$$$$$$$#\"\"\"\"\"\"#$$$$$$$$$$W");
  System.out.println(" #$$W    `$$$#\"            \"       !$$$$$`           `\"#$$$$$$$$$$#");
  System.out.println("  $$$     ``                 ! !iuW$$$$$                 #$$$$$$$#");
  System.out.println("  #$$    $u                  $   $$$$$$$                  $$$$$$$~");
  System.out.println("   \"#    #$$i.               #   $$$$$$$.                 `$$$$$$");
  System.out.println("          $$$$$i.                \"\"\"#$$$$i.               .$$$$#");
  System.out.println("          $$$$$$$$!         .   `    $$$$$$$$$i           $$$$$");
  System.out.println("          `$$$$$  $iWW   .uW`        #$$$$$$$$$W.       .$$$$$$#");
  System.out.println("            \"#$$$$$$$$$$$$#`          $$$$$$$$$$$iWiuuuW$$$$$$$$W");
  System.out.println("               !#\"\"    \"\"             `$$$$$$$##$$$$$$$$$$$$$$$$");
  System.out.println("          i$$$$    .                   !$$$$$$ .$$$$$$$$$$$$$$$#");
  System.out.println("         $$$$$$$$$$`                    $$$$$$$$$Wi$$$$$$#\"#$$`");
  System.out.println("         #$$$$$$$$$W.                   $$$$$$$$$$$#   ``");
  System.out.println("          `$$$$##$$$$!       i$u.  $. .i$$$$$$$$$#\"\"");
  System.out.println("             \"     `#W       $$$$$$$$$$$$$$$$$$$`      u$#");
  System.out.println("                            W$$$$$$$$$$$$$$$$$$      $$$$W");
  System.out.println("                            $$`!$$$##$$$$``$$$$      $$$$!");
  System.out.println("                           i$\" $$$$  $$#\"`  \"\"\"     W$$$$");
  System.out.println("                                                   W$$$$!");
  System.out.println("                      uW$$  uu  uu.  $$$  $$$Wu#   $$$$$$");
  System.out.println("                     ~$$$$iu$$iu$$$uW$$! $$$$$$i .W$$$$$$");
  System.out.println("             ..  !   \"#$$$$$$$$$$##$$$$$$$$$$$$$$$$$$$$#\"");
  System.out.println("             $$W  $     \"#$$$$$$$iW$$$$$$$$$$$$$$$$$$$$$W");
  System.out.println("             $#`   `       \"\"#$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  System.out.println("                              !$$$$$$$$$$$$$$$$$$$$$#`");
  System.out.println("                              $$$$$$$$$$$$$$$$$$$$$$!");
  System.out.println("                             $$$$$$$$$$$$$$$$$$$$\"");
      System.out.println ("\n\n\n");
        printSlow1 ("You've Broken the demons Skull!!! \n All its power is gone!!The Murderer is DEAD!!", 40);
        printSlow1 ("Good Job, " +Name,30);
        point+=2;
        waiting (3,"Returning to the Palace");
        space ();
        
        interactionsPanel ();
          }   
      }
    }
  //I used this when i needed the computer to scroll down for me
  public void space ()
  {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }
  //Same reason as above
  public void spaceHalf ()
  {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }
  //tax method
  //Made as planned, but the taxes that the player set do not affect the outcome of the game
  //This is because of the limitations of global variables (you said to try to have none)
  //Added information about the famine (because i removed the famine game mode)
  public void tax()
  {
    space ();
    waiting(3,"Creating Map");
    System.out.println ("                          ");
    System.out.println ("           Dragons Den  ");
    System.out.println ("                /o`-.  ,----------");
    System.out.println ("             _.'   `---'          |");
    System.out.println ("The         :          \\           |");
    System.out.println ("            :    Rohan   |          |      Inmelius");
    System.out.println ("End         ,'           /         |");
    System.out.println ("Of         :            |   Shire     |");
    System.out.println ("           :____________|            |");
    System.out.println ("           :             \\           |");
    System.out.println ("          :   Gondor     |          |");
    System.out.println ("World      :               |         |");
    System.out.println ("           ;      o       /  \\      |");
    System.out.println ("         /     Chromata  |     \\    |");
    System.out.println ("        (                |       \\ |");
    System.out.println ("         (              /        |");
    System.out.println ("           (           /              |");
    System.out.println ("           `-.        /  Rh�n      |");
    System.out.println ("             ;       /               |");
    System.out.println ("           .'_______/_________________|");
    //Made using the map from before
    printSlow ("Here is a close up of Inmelius");
    printSlow1 ("There are 4 states; Rohan (R), Gondor (G), Rh�n (H) and the Shire(S)", 20);
    
    char control='k';
    while (control!='s'&&control!='S'&&control!='R'&&control!='r'&&control!='g'&&control!='G'&&control!='h'&&control!='H')
    {
      control=IBIO.inputChar ("Which state would you like to focus on? (R/G/H/S)>> ");
      if  (control=='r'||control=='R') 
      {
        space ();
  System.out.println(" _______  _______           _______  _                ");
  System.out.println("(  ____ )(  ___  )|\\     /|(  ___  )( (    /|         ");
  System.out.println("| (    )|| (   ) || )   ( || (   ) ||  \\  ( |         ");
  System.out.println("| (____)|| |   | || (___) || (___) ||   \\ | |         ");
  System.out.println("|     __)| |   | ||  ___  ||  ___  || (\\ \\) |         ");
  System.out.println("| (\\ (   | |   | || (   ) || (   ) || | \\   |         ");
  System.out.println("| ) \\ \\__| (___) || )   ( || )   ( || )  \\  |         ");
  System.out.println("|/   \\__/(_______)|/     \\||/     \\||/    )_)         ");
  printSlow ("The people of Rohan are rely mostly on mining to earn their living. The piers and docks to the North are overrun with monsters\n No sane people live there");
  printSlow ("The majority of the people are poor-\nMost of the money earned by the industries go to rich merchants in other states");
  printSlow ("That combined with the constent monster attacks makes for a dangerous life yet dispite all this Rohan is still the mining capital of Inmelius");
  printSlow ("What do you want to do? \n I-Create Income Tax\n E-Create tax on exported goods(The merchents will be taxed) ");
  char setTax=IBIO.inputChar ("WHat do you want to do? (I/E)>> ")      ;                   
  while (setTax!='I'&&setTax!='i'&&setTax!='e'&&setTax!='E')
                                {
    JOptionPane.showMessageDialog(null, "Please enter a valid answer");
    setTax=IBIO.inputChar ("WHat do you want to do? (I/E)>> ");
  }
  if (setTax=='I'||setTax=='i')
  {
    int iTax=IBIO.inputInt ("What precentage do you want income tax to be set at(Number from 0-100)? ");
     if (iTax<=3)
     {
       waiting (4,"Setting Taxes");
       space ();
    printSlow ("The small income tax did not take away too much from the small incomes of the Rohanium people, and instead provided much needed taxes");
    printSlow ("This money can now be used to import food from other nations-In the end, the citizens benefit");
    printSlow ("Quest finished!!");
    point++;
    waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
     else 
     {
       waiting (4,"Setting Taxes");
       printSlow ("These taxes took away too much from the limited the income of the poor-Making them even poorer");
       space ();
       Try ();
       waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
  }
  else if (setTax=='e'||setTax=='E')
  {
    printSlow ("Note: The merchants will have to bear the wieght of these taxes, not the common people of Rohan");
      int iTax=IBIO.inputInt ("What precentage do you want taxes/tarrifs on exported goods to be set at?(Percentage from 0-100)>> ");
     if (iTax<=20)
     {
       waiting (4,"Setting Taxes");
       space ();
    printSlow ("This money gained from this tax helped to limit the rich, and instead put that money to good use by your discretion.");
    printSlow ("It will most likely be used to help pay for the government provided food that is sent to the houses of the starving");
    printSlow ("Good Job");
    point++;
    waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
     else 
     {
       waiting (4,"Setting Taxes");
       printSlow ("These taxes do indeed take away money from the rich, but are simply to high for a realistic economy");
       Try();
       waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
  }
      }
      else if (control=='g'||control=='G')
      {
         System.out.println(" _______  _______  _        ______   _______  _______ ");
  System.out.println("(  ____ \\(  ___  )( (    /|(  __  \\ (  ___  )(  ____ )");
  System.out.println("| (    \\/| (   ) ||  \\  ( || (  \\  )| (   ) || (    )|");
  System.out.println("| |      | |   | ||   \\ | || |   ) || |   | || (____)|");
  System.out.println("| | ____ | |   | || (\\ \\) || |   | || |   | ||     __)");
  System.out.println("| | \\_  )| |   | || | \\   || |   ) || |   | || (\\ (   ");
  System.out.println("| (___) || (___) || )  \\  || (__/  )| (___) || ) \\ \\__");
  System.out.println("(_______)(_______)|/    )_)(______/ (_______)|/   \\__/");
  System.out.println("                                                      ");
        printSlow ("The people of gondor rely mostly on the fishing industry. Like Rohan, most of the people living here are poor");
        printSlow ("Almost all of the fish are exported, and most of the money goes to rich merchants");
        char setTax1=IBIO.inputChar ("WHat do you want to do? (I/E/G)>> ")      ;                   
  while (setTax1!='I'&&setTax1!='i'&&setTax1!='e'&&setTax1!='E'&&setTax1!='g'&&setTax1!='G')
                                {
    JOptionPane.showMessageDialog(null, "Please enter a valid answer");
    setTax1=IBIO.inputChar ("WHat do you want to do? (I/E)>> ");
  }
  if (setTax1=='I'||setTax1=='i')
  {
    int iTax1=IBIO.inputInt ("What precentage do you want income tax to be set at?(Number from 0-100)>> ");
     if (iTax1<=3)
     {
       waiting (4,"Setting Taxes");
       space ();
    printSlow ("The small income tax did not take away from the small incomes of the Gondor people, and instead provided much needed tax money");
     printSlow ("This money can now be used to import food from other nations-In the end, the citizens benefit");
    point++;
    waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
     else 
     {
       waiting (4,"Setting Taxes");
       printSlow ("These taxes took away the income of the poor-making them even poorer");
       Try();
       waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
  }
  else if (setTax1=='e'||setTax1=='E')
  {
    printSlow ("Note: The merchants will have to bear the wieght of these taxes, not the common people of Gondor");
      int iTax1=IBIO.inputInt ("What precentage do you want taxes/tarrifs on exported goods to be set at?(Percentage from 0-100)>> ");
     if (iTax1<=20)
     {
       waiting (4,"Setting Taxes");
       space ();
    printSlow ("This money gained from this tax helped to limit the rich, and instead put that money to good use by your discretion");
     printSlow ("This money can now be used to import food from other nations-In the end, the citizens benefit");
    point++;
    waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
     else 
     {
       waiting (4,"Setting Taxes");
       printSlow ("These taxes do indeed take away money from the rich, but are simply to high for a realistic economy");
       Try();
       waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
  }
      }
      else if (control=='h'||control=='H')
      {
System.out.println(" _______                    _                         ");
  System.out.println("(  ____ )|\\     /||\\     /|( (    /|                  ");
  System.out.println("| (    )|| )   ( || )   ( ||  \\  ( |                  ");
  System.out.println("| (____)|| (___) || |   | ||   \\ | |                  ");
  System.out.println("|     __)|  ___  || |   | || (\\ \\) |                  ");
  System.out.println("| (\\ (   | (   ) || |   | || | \\   |                  ");
  System.out.println("| ) \\ \\__| )   ( || (___) || )  \\  |                  ");
  System.out.println("|/   \\__/|/     \\|(_______)|/    )_)                  ");
  System.out.println("                                                      ");
  printSlow ("The Rhunian people are the warriors of the nation\n Due to being on the borders with Kandahar, the people are trained for one purpose: war");
  printSlow ("They care little about matters outside of thier state; but are netherless the only people holding Kandahar at bay");
  printSlow ("As a result, most of thier money is supplied by the government-It would be wrong to tax them on it");
  waiting (3,"Starting Taxes again");
        tax();
      }
      else if (control=='s'||control=='S')
      {
          System.out.println(" _______          _________ _______  _______          ");
  System.out.println("(  ____ \\|\\     /|\\__   __/(  ____ )(  ____ \\         ");
  System.out.println("| (    \\/| )   ( |   ) (   | (    )|| (    \\/         ");
  System.out.println("| (_____ | (___) |   | |   | (____)|| (__             ");
  System.out.println("(_____  )|  ___  |   | |   |     __)|  __)            ");
  System.out.println("      ) || (   ) |   | |   | (\\ (   | (               ");
  System.out.println("/\\____) || )   ( |___) (___| ) \\ \\__| (____/\\         ");
  System.out.println("\\_______)|/     \\|\\_______/|/   \\__/(_______/         ");
  System.out.println("                                                 ");
        printSlow ("The Shire is the richest of all the provinces. Most of the wealth is funneled here.\n This is because it is far away from Kandahar providing the safest place for the center of the nations trade");
        printSlow ("It also has access to other nations, all of which are willing to trade. \n The shire is the economic captial of Inemlius");
        printSlow ("This also means that most of its inhabitants are FAR richer then people in other states");
              char setTax3=IBIO.inputChar ("WHat do you want to do? (I/E/G)>> ")      ;                   
  while (setTax3!='I'&&setTax3!='i'&&setTax3!='e'&&setTax3!='E'&&setTax3!='g'&&setTax3!='G')
                                {
    JOptionPane.showMessageDialog(null, "Please enter a valid answer");
    setTax3=IBIO.inputChar ("WHat do you want to do? (I/E)>> ");
  }
  if (setTax3=='I'||setTax3=='i')
  {
    int iTax3=IBIO.inputInt ("What precentage do you want income tax to be set at(Number from 0-100)? ");
     if (iTax3<=10)
     {
       waiting (4,"Setting Taxes");
       space ();
    printSlow ("The small income tax did not take away enough money from the rich to balance the disparity between the rich and the poor");
    Try();
    waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
     else 
     {
       waiting (4,"Setting Taxes");
       printSlow ("These taxes take away the money from the rich and give  to the poor");
        printSlow ("This money can now be used to import food from other nations-In the end, the citizens benefit");
       point++;
       waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
  }
  else if (setTax3=='e'||setTax3=='E')
  {
    printSlow ("Note: The merchants will have to bear the wieght of these taxes, not the common people of Gondor");
      int iTax3=IBIO.inputInt ("What precentage do you want taxes/tarrifs on exported goods to be set at?(Percentage from 0-100)>> ");
     if (iTax3<=20)
     {
       waiting (4,"Setting Taxes");
       space ();
    printSlow ("This money gained from this tax helped to limit the rich, and instead put that money to good use by your discretion");
     printSlow ("This money can now be used to import food from other nations-In the end, the citizens benefit");
    point++;
    waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
     else 
     {
       waiting (4,"Setting Taxes");
       printSlow ("These taxes do indeed take away money from the rich, but are simply to high for a realistic economy");
       Try();
       waiting (3,"Returning to Interactions Panel");
       interactionsPanel ();
     }
      }
      else
        JOptionPane.showMessageDialog(null, "Please enter a valid answer");
    }
  }
  }
    public void Try ()
    {
      space ();
                 spaceHalf();
 System.out.println(" _______           _______  _______ _________                 ");
  System.out.println("(  ___  )|\\     /|(  ____ \\(  ____ \\\\__   __/                 ");
  System.out.println("| (   ) || )   ( || (    \\/| (    \\/   ) (                    ");
  System.out.println("| |   | || |   | || (__    | (_____    | |                    ");
  System.out.println("| |   | || |   | ||  __)   (_____  )   | |                    ");
  System.out.println("| | /\\| || |   | || (            ) |   | |                    ");
  System.out.println("| (_\\ \\ || (/___) || (____/\\/\\____) |   | |                    ");
  System.out.println("(____\\/_)(_______)(_______/\\_______)   )_(                    ");
  System.out.println("                                                              ");
  System.out.println(" _______  _______ _________ _        _______  ______          ");
  System.out.println("(  ____ \\(  ___  )\\__   __/( \\      (  ____ \\(  __  \\         ");
  System.out.println("| (    \\/| (   ) |   ) (   | (      | (    \\/| (  \\  )        ");
  System.out.println("| (__    | (___) |   | |   | |      | (__    | |   ) |        ");
  System.out.println("|  __)   |  ___  |   | |   | |      |  __)   | |   | |        ");
  System.out.println("| (      | (   ) |   | |   | |      | (      | |   ) |        ");
  System.out.println("| )      | )   ( |___) (___| (____/\\| (____/\\| (__/  )_  _  _ ");
  System.out.println("|/       |/     \\|\\_______/(_______/(_______/(______/(_)(_)(_)");     
    }
      public boolean isValid (String c)
  {
    /* All valid data:
     Rock, ROCK, rock, r, R
     Paper, PAPER, paper, p, P
     Scissors, SCISSORS, scissors, s, S
     return true if valid, false otherwise
     */
    if (c.equals ("Rock")|| c.equals ("rock")||c.equals("r")||c.equals("C")||c.equals("ROCK"))
          return true;
    else if (c.equals ("Paper")|| c.equals ("paper")||c.equals("p")||c.equals("P")||c.equals("PAPER"))
          return true;
    else if (c.equals ("Scissors")|| c.equals ("SCISSOR")||c.equals("scissor")||c.equals("s")||c.equals("S"))
          return true;
    else 
     return false;
  }
  
  
  public char userChoice ()
  { //returns r, p or s, based on the user's choice
    
    
    //print options: rock, paper, scissors
    System.out.println (" Your options are rock, paper or scissors");
    
    //ask for user's choice. will need to store in String
    String choice="not";
    while (!isValid(choice))
    {
   choice=IBIO.inputString ("Your choice? ");
    }
     if (choice.equals ("Rock")|| choice.equals ("rock")||choice.equals("r")||choice.equals("C")||choice.equals("ROCK"))
          return 'r';
     else if (choice.equals ("Scissors")|| choice.equals ("SCISSORS")||choice.equals("scissors")||choice.equals("S")||choice.equals("s"))
          return 's';
     else if (choice.equals ("Paper")|| choice.equals ("paper")||choice.equals("p")||choice.equals("P")||choice.equals("PAPER"))
          return 'p';
     else
       return 's';
    
    //Loop: if invalid input, ask again
    //stopping condition is the isValid method!!
    //something like: while(!isValid(choice))
    
    //If: to standardize values
    //if you've got one of Rock, ROCK, rock, r, R, then return 'r'.
    //else if you've got one of Paper, PAPER, paper, p, P, then return 'p'.
    //else return 's';
    
   
  }
  
  
  public char compChoice ()
  { //make a random number between 1 and 3
    //if the number is 1, return r; 2 return s; 3 return p
    int random=((int)(3*Math.random())+1);
      if (random==1)
    return 'r';
    else if (random==2)
      return 's';
    else
      return 'p';
  }
  public char winner (char comp, char user)
  { //comp and user both hold one of r, s, p
    if (comp==user)
      return 'b';
      if (comp=='r'&&user=='s'||comp=='s'&&user=='p'||comp=='p'&&user=='r')
      return 'c';
    else
      return 'u';
    //returns c for computer, u for user and b for both
  }
}