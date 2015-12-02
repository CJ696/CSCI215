/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci215;

/**
 *
 * @author fbird
 */
import java.util.Scanner;

public class Adventure {

    /**
     *
     */
    public Adventure() {

    }

    public static void main(String[] args) {
//The computer will first ask someone's age. Remeber the game is PG13 but I ask them to make sure they are 18.
        System.out.println("The War of Ethics");
        System.out.println("Press 1 to begin or 0 to quit:");
//Use the scanner input
        Scanner scan = new Scanner(System.in);
//Based on age so user types digits.
        int num = scan.nextInt();
        if (num == 1) {
            System.out.println("In the not so distant future private military companies, called pmcs, use war as a way\n"
                    + "to make money. Pmc groups try to stay on top of\n"
                    + "their rivals in an arms race, were whoever has the newest gun also has the best\n"
                    + "chance of getting paid.\n"
                    + "\n"
                    + "You are the new guy, who is starting his first day in the field. After a long drawn\n"
                    + "out fight you have found your way into the enemies backline.\n"
                    + " In the enemies camp you have found only a commander, with a very important\n"
                    + "database containing his companies logs. After surprising the commander and wounding him in \n"
                    + "the chest, you decide to look at the database, as you do\n"
                    + "the commander motions you to stop with what little energy he can muster up.\n"
                    + "\n"
                    + "Commander: Wait. You.. You're the new guy huh...Please...Destroy the database\n"
                    + "...and...Pretend you saw nothing. Take it as a mans dying wish..\n"
                    + "\n"
                    + "New guy: Why would i do that? You are the one that brought important \n"
                    + "intel into the battlefield. You were practically asking to have it stolen.\n"
                    + "\n"
                    + "Commander: Its...not...what you...think. This belongs.....to the pmc\n"
                    + "soldier...so that they can.......talk with their...loved ones. They..\n"
                    + "are personal.....information for the soldiers.");

            System.out.println("How do you respond?");
            System.out.println("1. Ask why they would bring this into the field.");
            System.out.println("2. Ask who the commander is.");
            System.out.println("3. Ask what all is on this database.");
            System.out.println("4. Shoot the commander.");

        }

        int choice1 = scan.nextInt();
        if (choice1 == 1) {
            System.out.println("New Guy: Why in the world would you bring something this valuable into the field?\n"
                    + "That seems like a huge oversight by you guys.\n"
                    + "\n"
                    + "Commander: We.......are not in.....the field......this is......outside the field.\n"
                    + "Our........original base.....was attacked...by locals. Rather.....than kill.....them\n"
                    + "..we....decided to.....move our....base of.....operations. Then......your squad.....\n"
                    + "surprise attacked us......and we were forced to.....hide this...outside of the...fight.\n"
                    + "Please....destroy it.....dont put....innocent lives...in harms....way.");
            OneA();
        } else if (choice1 == 2) {
            System.out.println("New Guy: Who are you?\n"
                    + "\n"
                    + "Commander: What...a funny thing...to ask a dying man. I am....this units first...\n"
                    + "Commander.");
            OneA();
        } else if (choice1 == 3) {
            System.out.println("New Guy: What's on the database?\n"
                    + "\n"
                    + "Commander: All it...has.....is personnal....information....about our troops....and their\n"
                    + "families. It doesnt have....... any.........company.....infor....mation.");
            OneA();
        } else if (choice1 == 4) {
            System.out.println("You aim at the commander, he smiles as if knowing he only has seconds left. He opens\n"
                    + "his mouth to talk but before he can finish you fire again, silencing him forever.\n"
                    + "Now all that is left is to decide what to do with the database.");
            Final();
        } else {
            System.out.println("You've failed to enter a correct number. Your father would be proud. Goodbye");
            System.exit(0);
        }
    }

    public static void OneA() {
        System.out.println("After asking the commander your question he looks at you and speaks again.\n"
                + "\n"
                + "Commander: The last....person to use....that database......was Tom. He.....is one of..\n"
                + "..our new guys......His wife went into....labor...... as he....was reading the email\n"
                + ".....you guys....fired on us. Read.....his email......\n"
                + "1. Read the email.\n"
                + "2. Refuse to read the email.\n"
                + "3. Shoot the Commander\n"
        );
        Scanner scan = new Scanner(System.in);
        int choice2 = scan.nextInt();

        if (choice2 == 1) {
            System.out.println("You decide to do as the commander asks and read the email. The email is addressed to \n"
                    + "Tom, it's from his sister in law. The email goes on to describe his wifes situation and how\n"
                    + "they both wish he were home, for the baby and his safety. You notice blood\n"
                    + "on the keyboard.");
            TwoA();
        } else if (choice2 == 2) {
            System.out.println("You decide to stay professional and refuse the offer.\n"
                    + "\n"
                    + "New Guy: Sorry, but I am not gonna do that.\n"
                    + "\n"
                    + "Commander: Oh........well if....you did...you would realize these ...are ...people...\n"
                    + "you are shooting at..... the metal suits......has made....us all numb to that fact..\n"
                    + "making the people.....seem....inhuman.");
            TwoB();
        } else if (choice2 == 3) {
            Final();

        }

    }

    public static void Final() {
        System.out.println("1. Destroy the database.\n"
                + "2. Keep the database.\n"
        );

        Scanner scan = new Scanner(System.in);
        int finalChoice = scan.nextInt();

        if (finalChoice == 1) {
            System.out.println("You decide to destroy the database to protect the families information that may be\n"
                    + "stored inside. You close the briefcase and set a charge. When you are a\n"
                    + "safe distance away you detonate the explosive. This decision weighs heavey on you, should I have\n"
                    + "taken it. Disclosing to my chain, bringing innocent lives into this war. One could ask if this is ethically\n"
                    + "sound. I will gladly take my reprimandation if it means another innocent soul will be saved.");
            System.exit(0);
        } else if (finalChoice == 2) {
            System.out.println("You decide the database is too valuable to destroy. You close the briefcase and begin\n"
                    + "to walk away with it. As you do you look back. Looking towards the Commander one more time.\n"
                    + "He has an empty look on his face, one of failure. Maybe hes not dead yet, or maybe\n"
                    + "a part of you feels for the innocent lives that will be strung into this war. Can I be soley\n"
                    + "responsible for the deaths that this knowledge will bring. Is it ethical, one could ask.\n"
                    + "Forget it, Im just doing my job. Better catch up with my squad.");
        System.exit(0);
        }
    }
    
    public static void TwoA()
    {
        System.out.println("Commander: see.......these are people.....you are shooting at......if....you..care.\n"
                + "1.Ask about the blood.\n"
                + "2.Say \"this is war.\"\n"
                + "3.Shoot the commander."
        );
        
       Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if (a == 1)
        {
            System.out.println("New Guy: Who's blood is this?\n" +
"\n" +
"Commander: That....is Tom's......blood...he got..shot.....writing his.....email.\n" +
"\n" +
"New Guy: Did he make it?\n" +
"\n" +
"Commander: You..would have...to tell...me...I ran with the database after..wards...\n" +
"to protect......the data.");
            ThreeA();
        }
        else if(a == 2)
        {
            System.out.println("New Guy: This is war, people die its part of the job.\n" +
"\n" +
"Commander: Yes...but...our families...are not...part of this..war.");
            ThreeB();
        }
        else if(a == 3)
        {
            Final();
        }
    }
    
    public static void TwoB()
    {
        System.out.println("Commander: I can understand.....after all its hard to just.....pretend...they\n" +
"....are not...people.\n"
        +   "1. Say \"this is war.\"\n"
        +   "2. Argue with the Commanders statement.\n"
        +   "3. Shoot the Commander."
                );
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a == 1)
        {
            System.out.println("New Guy: This is war, people die its part of the job.\n" +
"\n" +
"Commander: Yes...but...our families...are not...part of this..war.");
            ThreeB();
        }
        else if(a == 2)
        {
            System.out.println("New Guy: No, i understand this is war, but we are fighting each other. When that \n" +
"happens people die. Besides you have killed my friends too you know.");
            ThreeB();
        }
        else if(a == 3)
        {
            Final();
        }
    }
    
    public static void ThreeA()
    {
        System.out.println("Commander: You should....read...what..Tom.....wrote.\n"
        +   "1. Read what Tom wrote.\n"
                + "2. Refuse to read what Tom wrote. Challenging the Commander.\n"
                + "3. Shoot the Commander"
        );
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a == 1)
        {
            System.out.println("You decide to read what Tom tried to write. It was not much just two and a half lines.\n" +
"\n" +
"\"I am so glad you are there with her. I wish i could be too, but as I have told\n" +
"her this job pays too well to quit. Besides fighting is what im good at ask he....\"\n" +
"\n" +
"After that the rest is garbled, probably from Tom fallin on the keyboard.");
            FourD();
        }
        else if(a == 2)
        {
            System.out.println("New Guy: No, i don't need to read it. You guys are the enemy why should i feel bad?\n" +
"\n" +
"Commander: I...am..not..asking you to....feel bad for us.....only our...families.");
            FourB();
        }
        else if(a == 3)
        {
            Final();
        }
    }
    
    public static void ThreeB()
    {
        System.out.println("1. Apologize to the Commander.\n"
                + "2. Tell the Commander he is your enemy\n"
                + "3. Shoot the Commander\n"
        );
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a == 1)
        {
            System.out.println("New Guy: I'm sorry, I'm new to all of this. This is my first time in the field.\n" +
"\n" +
"Commander: Do not apologize....I should not...help....you...but I...feel....I..need\n" +
"to. I am.....your enemy....I only...want to....protect the...people...back home.");
            FourA();
        }
        else if(a == 2)
        {
            System.out.println("New Guy: You are my enemy, as such, i feel no pity for you.\n" +
"\n" +
"Commander: so green....yet already.....so...cruel.");
            FourC();
        }
        else if(a == 3)
        {
            Final();
        }
    }
    
    public static void FourA()
    {
        System.out.println("Commander: Listen.....I....am going to die.....soon......i just....want you...to\n" +
"understand....this briefcase must....be...destroyed....for those at....home..\n" +
"\n" +
"1. Ask the Commander what he ment.\n"
        + "2. Challange the Commander.\n"
        + "3. Shoot the Commander."
        );
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a == 1)
        {
            System.out.println("New Guy: what do you mean by that?\n" +
"\n" +
"Commander: Man....its been so....long...since i have seen....someone..so...green. I.\n" +
"...am your.....enemy.....if......I..could fight.....we would....not be...talking...\n" +
"and one....of us.....would be dead....call this a rare.....opportunity..");
            Five();
        }
        else if(a == 2)
        {
            System.out.println("New Guy: Like you said we are people, so why are you backpeddling?\n" +
"\n" +
"Commander:No.....im not...like i said....this is....for you....we....are enemies..\n" +
"if....i could fight.....we would not...be talking...and one....of us....would be...\n" +
"dead....call this a rare.....opportunity.");
        }
        else if(a == 3)
        {
            Final();
        }
    }
    
    public static void FourB()
    {
        System.out.println("Commander: listen.....I am....your enemy.....if roles....were...reversed...i would\n" +
"....let your families....go...they are....not.....my enemy.\n" +
"\n" +
"1. Thank the officer for the kindness.\n"
                + "2. Question the Commanders decision."
                + "3. Stab the Commander."
        );
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a == 1)
        {
            System.out.println("New Guy: Thanks for the kindness.\n" +
"\n" +
"Commander: It....is not....kind....as I....would not have......talked to you like..\n" +
"..you have.....me.......i would have...ended you....saw the database had.....private\n" +
"family....info.....then...destroyed.....it");
            Five();
        }
        else if(a == 2)
        {
            System.out.println("New Guy: Why would you do that? After all more then personnal information could be\n" +
"on the hard drive.\n" +
"\n" +
"Commander: Its...possible...but I know....my higher ups.....would use the personnal\n" +
"....information......to attack......your people.....and that....is.....unfair....\n" +
"your family.....is not....part of this....war");
            Five();
        }
        else if(a == 3)
        {
            Final();
        }
    }
    
    public static void FourC()
    {
        System.out.println("New Guy: this is war, what is more cruel then that?\n" +
"\n" +
"Commander: easy....killing....innocent...people\n"
                + "1. Argue innocent are part of war.\n"
                + "2. Agree that innocent people are not part of war.\n"
                + "3. Strangle the Commander."
        );
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a == 1)
        {
            System.out.println("New Guy: Even the innocent are part of war.\n" +
"\n" +
"Commander: heh......i once...thought like you.....then I....shot a child.....it\n" +
"was......justified...he had a gun......but still...to take from someone.....who\n" +
"never....gave in the....first place.....hurt me deep.");
            Five();
        }
        else if(a == 2)
        {
            System.out.println("New Guy: You are right, the innocent are not part of this.\n" +
"\n" +
"Commander: Yes.....now please......listen.");
            Five();
        }
        else if(a == 3)
        {
            Final();
        }
    }
    
    public static void FourD()
    {
        System.out.println("New Guy: He wrote to his sister in law. Saying this job payed a lot and was worth it.\n" +
"\n" +
"Commander: Tom....is probably.....dead now.....so....now.....was it?\n" +
"\n" +
"1. Agree with Tom.\n"
                + "2. Disagree with Tom.\n"
                + "3. Snap the Commanders neck.\n"
        );
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a == 1)
        {
            System.out.println("New Guy: Yes he was, after all his family will be set for awhile. My company has\n" +
"an insurance policy for those killed. Its worth a lot.");
            Five();
        }
        else if(a == 2)
        {
            System.out.println("New Guy: No, it wasnt worth it. He left a family without a father.\n" +
"\n" +
"Commander: No....whoever shot him....did that...he simply....made a dangerous....\n" +
"decision");
            Five();
        }
        else if(a == 3)
        {
            Final();
        }
    }
    public static void Five()
    {
        System.out.println("Commander: listen....i dont.....have long left.....so please.....tell me....are you..\n" +
"going to....destroy it?\n"
                + "1. Agree to destroy the database.\n"
                + "2. Decide to take database.\n"
                + "3. Shank the Commander.\n"
        );
        
         Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        if(a == 1)
        {
            System.out.println("New Guy: yes, i will. To protect those not involved in this.\n" +
"\n" +
"Commander: thank yoooooo.......\n" +
"\n" +
"The commander's voice begins to fall as his lungs finally give.");
            Final();
        }
        else if(a == 2)
        {
            System.out.println("New Guy: Sorry, but orders are orders. Besides this might have more then the personnal\n" +
"information on it.");
            Final();
        }
         else if(a == 3)
        {
            Final();
        }
    }
}
