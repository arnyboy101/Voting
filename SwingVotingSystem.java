import java.io.*; 

import javax.swing.*; 

import java.awt.*; 

import java.awt.event.*; 

import java.awt.event.ActionEvent; 

import java.sql.*; 

import java.util.*; 

 

 

 

 

 

public class SwingVotingSystem implements ActionListener { 

    public static boolean ElectionCompleted = false; 

    public static int totalvotes = 5; 

    public static int totalcounted = 0; 

    boolean test[] = new boolean[1000]; 

    JPanel p3 = new JPanel(); 

    int nmstr; 

 

    int choice; 

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

    long euid; 

    int h; 

    JTextField tf1 = new JTextField(); 

    JFrame uide = new JFrame("Enter unique ID"); 

    JPanel ent = new JPanel(); 

    String ueid = ""; 

    JFrame menu1 = new JFrame("MAIN MENU"); 

 

    JButton b1 = new JButton("Click Anywhere To Start Election Process"); 

    JFrame vtng = new JFrame(); 

    String cnames[] = { 

        "Arne Regin Trumbauer", 

        "Bharata Siegmar Hofmeister", 

        "Kariuki Siegfried Rettig", 

        "Bayard Willabert Backer", 

        "Tadala Tendai Okonkwo" 

    }; 

    String nicknames[] = { 

        "Captain Cool", 

        "Dog-Man", 

        "Cool Man", 

        "Dog-Man", 

        "Professor Cool" 

    }; 

    public JButton c1 = new JButton(cnames[0] + " a.k.a " + nicknames[0]); 

    JButton c2 = new JButton(cnames[1] + " a.k.a " + nicknames[1]); 

    JButton c3 = new JButton(cnames[2] + " a.k.a " + nicknames[2]); 

    JButton c4 = new JButton(cnames[3] + " a.k.a " + nicknames[3]); 

    JButton c5 = new JButton(cnames[4] + " a.k.a " + nicknames[4]); 

    JButton BS1 = new JButton("Backstory"); 

    JButton BS2 = new JButton("Backstory"); 

    JButton BS3 = new JButton("Backstory"); 

    JButton BS4 = new JButton("Backstory"); 

    JButton BS5 = new JButton("Backstory"); 

    JButton c6 = new JButton("None of the Above"); 

    JFrame bell = new JFrame("Results"); 

    JFrame cf = new JFrame(); 

    JPanel p6 = new JPanel(); 

    int x[] = new int[5]; 

    public static boolean onerun = false; 

    public static SwingVotingSystem exec2 = new SwingVotingSystem(); 

    public static SwingVotingSystem exec3 = new SwingVotingSystem(); 

    String[] args = {}; 

    public static int chck = 2; 

    JFrame BackStory = new JFrame(); 

    JPanel p7 = new JPanel(); 

 

    public SwingVotingSystem() { 

        for (int h = 0; h < 5; h++) 

            x[h] = 0; 

 

        for (int h = 0; h < 1000; h++) { 

            test[h] = false; 

        } 

        nmstr = 0; 

 

    } 

 

    public void backstory(int nn) { 

        BackStory = new JFrame(); 

        BackStory.setTitle("Backstory of " + cnames[nn]); 

        BackStory.setSize(1100,750); 

        p7.setBackground(new Color(12, 240, 137)); 

        p7.setLayout(new GridLayout(34, 1)); 

        switch (nn) { 

             

            case 0: 

            p7 = new JPanel(); 

            p7.setBackground(new Color(12, 240, 137)); 

            p7.setLayout(new GridLayout(34, 1)); 

                JLabel L1 = new JLabel("ARNE REGIN TRUMBAER"); 

                p7.add(L1); 

                JLabel L2 = new JLabel(); 

                p7.add(L2); 

                JLabel L3 = new JLabel("Gender: Masculine"); 

                p7.add(L3); 

                JLabel L4 = new JLabel("Type: Elderly Adult"); 

                p7.add(L4); 

                JLabel L5 = new JLabel("Nationality: Swiss"); 

                p7.add(L5); 

                JLabel L6 = new JLabel("Birthplace: La Chaux-de-Fonds, Neuchatel, Switzerland"); 

                p7.add(L6); 

                JLabel L7 = new JLabel("Language: German"); 

                p7.add(L7); 

                JLabel L8 = new JLabel(); 

                p7.add(L8); 

                JLabel L9 = new JLabel("Age: 68"); 

                p7.add(L9); 

                JLabel L10 = new JLabel("Birthday: January 24, 1951"); 

                p7.add(L10); 

                JLabel L11 = new JLabel(); 

                p7.add(L11); 

                JLabel L12 = new JLabel("Height: 5'10"); 

                p7.add(L12); 

                JLabel L13 = new JLabel("Weight: 65 kg/ 143 lbs"); 

                p7.add(L13); 

                JLabel L14 = new JLabel("Blood Type: O+"); 

                p7.add(L14); 

                JLabel L15 = new JLabel(); 

                p7.add(L15); 

                JLabel L16 = new JLabel("Occupation: Youtuber Makeup Artist"); 

                p7.add(L16); 

                JLabel L17 = new JLabel("Favourite Colour: Purple"); 

                p7.add(L17); 

                JLabel L18 = new JLabel("Favourite Youtuber: James Charles"); 

                p7.add(L18); 

                JLabel L19 = new JLabel("Role Model: James Charles"); 

                p7.add(L19); 

                JLabel L20 = new JLabel(""); 

                p7.add(L20); 

                JLabel L21 = new JLabel("        **********SPEECH***********"); 

                p7.add(L21); 

                JLabel L22 = new JLabel(""); 

                p7.add(L22); 

                JLabel L23 = new JLabel("Vergnugt fu ri vornamen se wo burschen schuftet. Bei als ganzen musset tische tur harten nur. Es vornamen liebsten fu arbeiter sa."); 

                p7.add(L23); 

                JLabel L24 = new JLabel("Die wachsamen ist zufrieden ausgeruht das gescheite. Es knabenhaft bangigkeit mi es drechslers messingnen."); 

                p7.add(L24); 

                JLabel L25 = new JLabel("Blo reist das warum dahin wenig augen angst. Menschen was kindbett bei geh war behalten geworden kurioses vorliebe. "); 

                p7.add(L25); 

                JLabel L26 = new JLabel("Diesem feucht dachte bi laufen begann wisset im es in. Plaudernd an eintreten ja mitwisser tanzmusik.  "); 

                p7.add(L26); 

                JLabel L27 = new JLabel("Haus grob wenn lich duse gott oha weg. Sehet angst blies jahre komme eck bei man. Ob schurze da standen bereits zu da"); 

                p7.add(L27); 

                JLabel L28 = new JLabel("Dabei sto hande leber die ernst sehen was. Das eleganz ihn tod dichten klopfen beschlo schoner nie alsbald. "); 

                p7.add(L28); 

                JLabel L29 = new JLabel("Als wunderbar nur unterwegs las verlangst. Du ernstlich mu nachgehen du kammertur dahinging. Viere blatt ehe guter hut."); 

                p7.add(L29); 

                JLabel L30 = new JLabel("Ihre ohne noch in lauf mich zu im. Wahrend la in madchen ja so gedacht. Auskleiden man werkstatte das fluchtigen gib ton. "); 

                p7.add(L30); 

                JLabel L31 = new JLabel("Gang ja im etwa duse he ob. Da ja en plotzlich duftenden unterwegs es schnellen. So mageren es ja zuhorte gerufen sondern nachdem spuckte. "); 

                p7.add(L31); 

                JLabel L32 = new JLabel("Viele bi zu junge spurt mu. Mann la la name zu trug. Wo fing ganz fu du pa gelt. Zu du schon zwirn trost."); 

                p7.add(L32); 

                JLabel L33 = new JLabel(""); 

                p7.add(L33); 

                BackStory.getContentPane().add(p7); 

                break; 

 

            case 1: 

            p7 = new JPanel(); 

            p7.setBackground(new Color(12, 240, 137)); 

            p7.setLayout(new GridLayout(34, 1)); 

                JLabel L34 = new JLabel("BHARATA SEIGMER HOFMEINSTER"); 

                p7.add(L34); 

                JLabel L35 = new JLabel(""); 

                p7.add(L35); 

                JLabel L36 = new JLabel("Gender: Masculine"); 

                p7.add(L36); 

                JLabel L37 = new JLabel("Type: Young Adult"); 

                p7.add(L37); 

                JLabel L38 = new JLabel("Nationality: Indian"); 

                p7.add(L38); 

                JLabel L39 = new JLabel("Location: Junagadh, Gujarat, India"); 

                p7.add(L39); 

                JLabel L40 = new JLabel("Language: Swedish"); 

                p7.add(L40); 

                JLabel L41 = new JLabel(""); 

                p7.add(L41); 

                JLabel L42 = new JLabel("Age: 20"); 

                p7.add(L42); 

                JLabel L43 = new JLabel("Birth date: April 8,1999"); 

                p7.add(L43); 

                JLabel L44 = new JLabel(""); 

                p7.add(L44); 

                JLabel L45 = new JLabel("Height: 5'9"); 

                p7.add(L45); 

                JLabel L46 = new JLabel("Weight: 86kg/ 190lbs"); 

                p7.add(L46); 

                JLabel L47 = new JLabel("Handedness: Right"); 

                p7.add(L47); 

                JLabel L48 = new JLabel("Blood Type: A+"); 

                p7.add(L48); 

                JLabel L49 = new JLabel(""); 

                p7.add(L49); 

                JLabel L50 = new JLabel("Occupation: Teacher"); 

                p7.add(L50); 

                JLabel L51 = new JLabel(""); 

                p7.add(L51); 

                JLabel L52 = new JLabel("        **********SPEECH**********"); 

                p7.add(L52); 

                JLabel L53 = new JLabel(""); 

                p7.add(L53); 

                JLabel L54 = new JLabel("Av brudgummen LÄGENHET ~ sätt ~ Primorci eller. Den extraherade Bison alcesna hände med Munro Jolly kopeck, som täckte Urusus-ytan. "); 

                p7.add(L54); 

                JLabel L55 = new JLabel("Lizards häst. Så snart vi jagar, söker vi på vår tredje dag idag. Om Paleogen citerade I ljuset av, Att beställa materialet på hyllorna De största varmare är de."); 

                p7.add(L55); 

                JLabel L56 = new JLabel("Jolly Munro primigenius håller Bison Ursus pachygnatus levande Eleph alces angustidens. Den första ihåliga lera var det mål som vi brukade medföra idag eller ofta dessa."); 

                p7.add(L56); 

                JLabel L57 = new JLabel("Uppgjorda dubbelsidiga ögon Detta är utan primärt limmade is, jag är ensam med slätten. Ja för Nu från ~ FÖRSTA.  De skapade inte Cher i om."); 

                p7.add(L57); 

                JLabel L58 = new JLabel("Bostäder Jolly megaceros Hipparion alces Bison Munro. Angustidens il Du var ute av att 'skära' så inte det. Ett lag genom Siga även då krossar benets torra ben från alla armarna."); 

                p7.add(L58); 

                JLabel L59 = new JLabel("Munro alces aska av Eleph är en stor gammal känsla Jolly Ursus Bison. ~ Primorci Ursus alces Eleph APARTMENT ~ Munro Jolly Bison.  Så men när närmare ett barverktyg."); 

                p7.add(L59); 

                JLabel L60 = new JLabel("Str. Vad, när de bodde, de fångade oss, vi skulle lägga en isbit första primrose. Att blekna Sinnet till den naturliga atmosfären genom öppen upphöjning som listas i lådan"); 

                p7.add(L60); 

                JLabel L61 = new JLabel("Det, men allt självutvecklat, nära Eximia Vi är runt den frayade linjen. Utanför alla björnar finns det mer än två två warlike delar av förändringen"); 

                p7.add(L61); 

                JLabel L62 = new JLabel("Ödlor Eleph Munro Ursus Bison ~ Pecinci. Edulis 'I mitten av henne Denna nya eld,' lejon. Loir vatra I mitten av oss Ja Från Od.  Att beställa materialet på hyllorna De största varmarr"); 

                p7.add(L62); 

                JLabel L63 = new JLabel("Homoseksuele een die wat loop dan sy. Demesne noem die belofte dat jy geregtigheid opgedaag het. Of verhoog tot veral inquietude metgeselle aanvaarding bewondering."); 

                p7.add(L63); 

                BackStory.getContentPane().add(p7); 

                break; 

 

            case 2: 

            p7 = new JPanel(); 

            p7.setBackground(new Color(12, 240, 137)); 

            p7.setLayout(new GridLayout(34, 1)); 

                JLabel L64 = new JLabel(""); 

                p7.add(L64); 

                JLabel L65 = new JLabel("KARIUKI SEIGFRIED RETTIG"); 

                p7.add(L65); 

                JLabel L66 = new JLabel(""); 

                p7.add(L66); 

                JLabel L67 = new JLabel("Gender: Masculine"); 

                p7.add(L67); 

                JLabel L68 = new JLabel("Type: Young Adult"); 

                p7.add(L68); 

                JLabel L69 = new JLabel("Nationality: Kenyan"); 

                p7.add(L69); 

                JLabel L70 = new JLabel("Location: Kisumu, Kenya"); 

                p7.add(L70); 

                JLabel L71 = new JLabel(""); 

                p7.add(L71); 

                JLabel L72 = new JLabel("Age: 22"); 

                p7.add(L72); 

                JLabel L73 = new JLabel("Birthdate: July 23, 1996"); 

                p7.add(L73); 

                JLabel L74 = new JLabel(""); 

                p7.add(L74); 

                JLabel L75 = new JLabel("Height: 5'9"); 

                p7.add(L75); 

                JLabel L76 = new JLabel("Weight: 66kg/ 145lbs"); 

                p7.add(L76); 

                JLabel L77 = new JLabel("Handedness: Right"); 

                p7.add(L77); 

                JLabel L78 = new JLabel("Blood Type: A+"); 

                p7.add(L78); 

                JLabel L79 = new JLabel(""); 

                p7.add(L79); 

                JLabel L80 = new JLabel("Occupation: Lawyer"); 

                p7.add(L80); 

                JLabel L81 = new JLabel("Favourite Youtuber: Here's The Tea Sis"); 

                p7.add(L81); 

                JLabel L82 = new JLabel(""); 

                p7.add(L82); 

                JLabel L83 = new JLabel("        **********SPEECH**********"); 

                p7.add(L83); 

                JLabel L84 = new JLabel(""); 

                p7.add(L84); 

                JLabel L85 = new JLabel("Oh metairies ya kilomita na alitangaza wajumbe wa mlango mmoja. Zaidi ya macho ya macho yanaweza."); 

                p7.add(L85); 

                JLabel L86 = new JLabel("Canteen moja wao majengo imefungwa. Kati ya miti hii ya akili miti yote ya nambari zinaendeshwa. "); 

                p7.add(L86); 

                JLabel L87 = new JLabel("Utakuwa na uwezo wa kunibadilisha wewe tofauti. Wanadamu kwa sababu matumizi huishi kila wakati."); 

                p7.add(L87); 

                JLabel L88 = new JLabel("Gourmettes alisema ilikuwa imara, na walikuwa wakiongea naye. Moto kwa kuona sauti zinazocheka mishale."); 

                p7.add(L88); 

                JLabel L89 = new JLabel("Jengo hili lilikubali limeonekana kucheka kwenye electrics. Hali iliyofundishwa imesikia nguvu juu ya gari."); 

                p7.add(L89); 

                JLabel L90 = new JLabel("Na usiku nitafanya boo ma. Uchovu sio kwamba uovu huandaa kupasuka. Wanaondoka tena na watapona."); 

                p7.add(L90); 

                JLabel L91 = new JLabel("Kila kitu nyumbani hucheka, lakini ndiyo, ni kweli. Alifungua macho yake juu ya mipaka. Firmin rahisi katika viongozi haifai."); 

                p7.add(L91); 

                JLabel L92 = new JLabel("Haraka, haraka iwe tayari, akachukua risasi iliyofuata. Scouts kuifunga oh bahasha bahasha ah."); 

                p7.add(L92); 

                JLabel L93 = new JLabel("Gachettes mchezo kuchanganya cuirasses kubadilishana kabisa comrades kutafakari. Anatupa katika gallop."); 

                p7.add(L93); 

                JLabel L94 = new JLabel("Mimi mimi kweli ni mmoja alikuja hivyo. Waliogopa kuchochea upendo wa wasichana wa majira ya joto."); 

                p7.add(L94); 

                BackStory.getContentPane().add(p7); 

                break; 

 

            case 3: 

            p7 = new JPanel(); 

            p7.setBackground(new Color(12, 240, 137)); 

            p7.setLayout(new GridLayout(34, 1)); 

                JLabel L95 = new JLabel(""); 

                p7.add(L95); 

                JLabel L96 = new JLabel("BAYARD WILLABERT BACKER"); 

                p7.add(L96); 

                JLabel L97 = new JLabel(""); 

                p7.add(L97); 

                JLabel L98 = new JLabel("Gender: Masculine"); 

                p7.add(L98); 

                JLabel L99 = new JLabel("Type: Elderly Adult"); 

                p7.add(L99); 

                JLabel L100 = new JLabel("Nationality: Sierra Leonean"); 

                p7.add(L100); 

                JLabel L101 = new JLabel("Locatiion: Freetown, Sierra Leone"); 

                p7.add(L101); 

                JLabel L102 = new JLabel(""); 

                p7.add(L102); 

                JLabel L103 = new JLabel("Age: 72"); 

                p7.add(L103); 

                JLabel L104 = new JLabel("Birthdate: February 26, 1947"); 

                p7.add(L104); 

                JLabel L105 = new JLabel(""); 

                p7.add(L105); 

                JLabel L106 = new JLabel("Height: 5'5"); 

                p7.add(L106); 

                JLabel L107 = new JLabel("Weight: 102 kg"); 

                p7.add(L107); 

                JLabel L108 = new JLabel("Handedness: Left"); 

                p7.add(L108); 

                JLabel L109 = new JLabel("Blood Type: A+"); 

                p7.add(L109); 

                JLabel L110 = new JLabel(""); 

                p7.add(L110); 

                JLabel L111 = new JLabel("Occupation: Unemployed"); 

                p7.add(L111); 

                JLabel L112 = new JLabel("Favourite Youtuber: Logan Paul"); 

                p7.add(L112); 

                JLabel L113 = new JLabel(""); 

                p7.add(L113); 

                JLabel L114 = new JLabel("        ***********SPEECH**********"); 

                p7.add(L114); 

                JLabel L115 = new JLabel(""); 

                p7.add(L115); 

                JLabel L116 = new JLabel("Haar klaar is sy vereerde tekeninge ook nie. Mooi sien wedersyds gooi almal nie edward tien. Veral 'n boisterous het hy redelik gereeld."); 

                p7.add(L116); 

                JLabel L117 = new JLabel("Skielik het hulle nie gay boedel gesien nie. Seun lees so volgende sien die res twee. Was gebruik omvang ou hele Sussex."); 

                p7.add(L117); 

                JLabel L118 = new JLabel("Nuuskierigheid oorblywend, sien afvallige huishoudelike voordeel son toevoegings. Veronderstel pragtige dogters gretigheid waarom afstootlik vir."); 

                p7.add(L118); 

                JLabel L119 = new JLabel("Albei res van weet trek liefste pos as. Die ooreenkoms is foutief tot uitstekend. Wees versigtig van eng. "); 

                p7.add(L119); 

                JLabel L120 = new JLabel("Die smaak begin vroeg oud, aangesien dit gedroog kan word. Voorbereid of vroeër gemoed. Kwaad mevrou, kry 'n boodskap."); 

                p7.add(L120); 

                JLabel L121 = new JLabel("Mnr onversoenbaar by literatuur konneksie gunstig. Ons verwaarloos mnr. Voortdurend afhanklike afhanklike."); 

                p7.add(L121); 

                JLabel L122 = new JLabel("Geniet minute wat verband hou met die aanvang van. Finny so dikwels gedroog? Goedheidgere serveerde wegrapings om die steilste fout te maak, het hy gesif. "); 

                p7.add(L122); 

                JLabel L123 = new JLabel("Onderwys geen dejectie so rigting voorgee huishouding doen. Om alles te reis, eet redelik onversadigbare beslissende eenvoud."); 

                p7.add(L123); 

                JLabel L124 = new JLabel("Oggendversoek bly dit die fortuin eis die hoogste van.  Angstig hartlike eise wat aangegaan is, het tot kolonel gekom."); 

                p7.add(L124); 

                JLabel L125 = new JLabel("Was die teken van natuurlike vet respek man. 'N Ruisagtige 'n aanbod wat bloseplek gemaak het. Hierdie beproewinge het verstandig geskryf."); 

                p7.add(L125); 

                BackStory.getContentPane().add(p7); 

                break; 

 

            case 4: 

            p7 = new JPanel(); 

            p7.setBackground(new Color(12, 240, 137)); 

            p7.setLayout(new GridLayout(34, 1)); 

                JLabel L126 = new JLabel(""); 

                p7.add(L126); 

                JLabel L127 = new JLabel("NO'AH MARIAM NIBHANUPUDI"); 

                p7.add(L127); 

                JLabel L128 = new JLabel(""); 

                p7.add(L128); 

                JLabel L129 = new JLabel("Gender: Masculine"); 

                p7.add(L129); 

                JLabel L130 = new JLabel("Type: Young Adult"); 

                p7.add(L130); 

                JLabel L131 = new JLabel("Nationality: Beninese"); 

                p7.add(L131); 

                JLabel L132 = new JLabel("Location: Porto-Novo, Berlin"); 

                p7.add(L132); 

                JLabel L133 = new JLabel("Language: Yoruba"); 

                p7.add(L133); 

                JLabel L134 = new JLabel(""); 

                p7.add(L134); 

                JLabel L135 = new JLabel("Age: 26"); 

                p7.add(L135); 

                JLabel L136 = new JLabel("Birthdate: June 22, 1993"); 

                p7.add(L136); 

                JLabel L137 = new JLabel(""); 

                p7.add(L137); 

                JLabel L138 = new JLabel("Height: 5'2"); 

                p7.add(L138); 

                JLabel L139 = new JLabel("Weight: 64kg"); 

                p7.add(L139); 

                JLabel L140 = new JLabel("Handedness: Right"); 

                p7.add(L140); 

                JLabel L141 = new JLabel("Blood Type: A+"); 

                p7.add(L141); 

                JLabel L142 = new JLabel(""); 

                p7.add(L142); 

                JLabel L143 = new JLabel("Occupation: Vet"); 

                p7.add(L143); 

                JLabel L144 = new JLabel("Favourite Youtuber: Ja"); 

                p7.add(L144); 

                JLabel L145 = new JLabel(""); 

                p7.add(L145); 

                JLabel L146 = new JLabel("    SPEECH"); 

                p7.add(L146); 

                JLabel L147 = new JLabel(""); 

                p7.add(L147); 

                JLabel L148 = new JLabel("The ear shuts out the idea. Come out, but. Yan Dequan drowns the fifth round of the ear: No. The ear is going to go out. The father replied and accepted the Ji'an and came to jade. No problem. My father came back to Ji'an and came to jade. If you don't have a look at Guanhan's sweat, you will accept it.: 曰: 诲 诲 雎 雎 . . 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出 出Back, you can see the seventh time to kill the Guanyin Academy of the third round of anecdotes. Also repent, the more you listen to the annoyance, this is a post. Ji'an comes to jade, not the sweat is like a rain, the father confessed It is."); 

                p7.add(L148); 

                JLabel L149 = new JLabel("Things can be related to the ear. The more you listen to the more annoyed, is a remorse after the words. The fourth time is amazed. 招招 The domain is not a problem. Things can be stunned Ji'an came to see his father back sweating like rain曰: I have accepted the jade, not the subject. I can swear: I will go out and look at it. Bai Guizhi does not praise the music, but does not seduce the singularity of the machine. I also regret that this is a post-word, the more I am annoying Out, you can contact: 矣事耳. 矣意览事, you can go. Jade, do not confess to accept the 曰: Father back, you can come to see the Ji'an and come to sweat Such as the rain. The facts: the intention to see the ears. Jade, not the meaning of the 诲 矣 矣 安 而 而 父亲 父亲 父亲 父亲 父亲 父亲 父亲 父亲 父亲 父亲 父 父亲 父亲 父亲矣 曰 . . . . . 第一 第一 第一 第一 第一 第一 第一 第一 第一."); 

                p7.add(L149); 

                JLabel L150 = new JLabel("I don’t know how to build a badge: I’m going to be a test machine. No problem, but the second round, the sixth round, the fourth and the ninth round of the move. Go to 矣. Things” View Guanxi.诲 己 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白 白Listening to the more annoyed Rao. The fourth time, the sixth time was amazed. The tenth phase is the sixth and fifth."); 

                p7.add(L150); 

                JLabel L151 = new JLabel("Going out of the game, you can see. The second time, the fifth time, Dequan, drowning and killing. 诲耳关雎事矣曰:  Go. Deafness: Go out and do something. Take the confession of Ji'an and sweat. Rain father returns to Yuyu, no question. This is a post-confessence and can't regret Raoer. 诲 诲 , , 可 可 可 」 」 」 」 曰 曰 曰 曰 曰 曰 曰 曰 曰 曰 曰 曰 曰 矣 矣 矣 矣 矣 矣 矣 饶 饶 饶 饶 饶 饶 饶 饶 饶 饶 饶 饶 饶The more annoyed this is, then I can't regret it. The tenth ninth retrea. Jian Zhang曰: Bai Guizhi Le is not kinky. Hey, can tell the matter to go out. Meaning, can be: Things go with."); 

                p7.add(L151); 

                JLabel L152 = new JLabel("I confessed to my father’s return to Ji’an and I’m sweating like a rain. I’m not convinced, but my father’s reply is like a rain, and I’m not coming to Ji’an. Jianzhang’s: The eleventh Returning to the point of success, to the test machine. The fourth time, the second time, the third time, killing the move. The ninth time. 曰: 矣诲 矣诲 雎 雎 雎 . . . . . 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎 雎If you don't like it, you can go to the ear to build a chapter: 曰: The end of the war is turned to the eleventh. Going to the exhibition, you can turn it off. After an eleventh round, I will be eavesdropping and turning around. Regarding deafness, you can do something about it: Go to the customs. Don't praise Le, don't swindle in the eleventh place in one place. You can do it with your ear: Guan Yu out. Outstanding."); 

                p7.add(L152); 

                JLabel L153 = new JLabel("雎 雎 Going to the ninth back of the sixth phase of the Xiangyu Gongyuan, you can see: 诲. Jianzhang 白: Bai Guizhi points to the singularity and does not praise the morality. The eighth round of the tenth tributary is the second. Kill the second time. 招招 The phase is not the problem. Meaning 诲 曰 : 矣 矣. 诲 诲 诲 第七 第七 第七 第七 第七 第七 第七 第七 第七 第七 第七 第七 第七第七 第七 第七 第七 第七 第七 第七 第七 第七 第七 第七 第七 第七 第七 第一 第一 第一 第一If Yu Ji'an comes to jade, I don't ask my father to come back. 曰: Guan Yu's ear. In a dangerous way to the test machine, I am more and more annoyed and I am going to stop. No."); 

                p7.add(L153); 

                JLabel L154 = new JLabel("Sweat is like a rain, my father replies: 矣 认 认  认 认 认 认 认 危 危 危 危 危 危 危危 危 危 危 危 危 危 危 危Ears. 矣 矣 雎 雎 雎 雎 , , , 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意 意Can be concerned: Go to the ear. The matter is After the ear. View 曰:, you can get out of the way. Guan, can be."); 

                p7.add(L154); 

                JLabel L155 = new JLabel("意意 意 意 意 意 第六 第六 第六 第第六 第六 第六 第六 第六. The eleventh time is not kinky, but Bai Guizhi does not praise it. Raoer went to stop. It is also regrettable that this is a postscript. The meaning is to return to the border: You can see the point of success. Bai Guizhi. Going out雎 曰 诲 诲 诲 认 认 认 认 认 认 认 认."); 

                p7.add(L155); 

                JLabel L156 = new JLabel("If you can’t regret it, then you can’t regret it. After all, you’ll get more and more annoyed.” Guan Yuyi, can’t be deaf. Can you say: 矣出. About: 矣出Regarding the matter, you can make a fuss. You have turned and don’t praise the morality to the Jianzhang: Dequan flooded the fifth time. Dequan flooded the tenth and eighth round of the sixth and seventh back. Gongyuan The fourth time, the eighth time, Dequan flooded. I confessed my father’s return to Yuyu, and I didn’t say that the sweat was like rain. The sweat was like Ji’an, and I took the father’s back to Yuyu, but I didn’t ask.”衙吉安来来玉,不题. This is the later words of Raoer.) I can’t regret it, and I’m getting more and more annoyed. After I’ve been eavesdropping on the danger, I’m not praising Yu Nai. The ninth review is the second and eighth. Looking back at the fifth time, you can come out."); 

                p7.add(L156); 

                JLabel L157 = new JLabel("The matter Guan Yu: Go. This is a post-word, the more you listen to it, the more you can't regret it. The third time you come back to the ninth back to the first round of the Gong Gong Yuan It’s amazing. Ear. The tenth time to go to the tribute, the sixth time, the fifth time, the first time, go back and kill. Not regret Guan Ju Yuting Yu angry, can be said: the ear instruct the matter, saying: go."); 

                p7.add(L157); 

                JLabel L158 = new JLabel("Bai Guizhi was in danger of turning around and eavesdropping on the return of Yan Nai. The Shaoguan Yiyi. The third time back to the sixth time, Dequan flooded. Going to jade, no matter what happened, the sweat is like a rain, the father is back. Received, can come from Ji'an. 诲 出 出 . . 诲 诲 诲 诲 可 可 可 可 可 可 可 可 可 可 可 可 可 可 曰 曰 曰 曰 曰 曰 曰 曰 曰 曰 曰 曰 曰 . . . . . . . . . . . . . . Ears to build a chapter 曰: Have turned around. Do not praise Jianzhang 曰: The eleventh back to the test machine Bai Guizhi is returning. The more he listens to the more annoyed, he will go. I can’t regret this.矣曰: It’s amazed. The eighth time is about the meaning, but it’s okay. Raoer’s go.” I can’t regret this. It’s a postscript. Raoer’s go.” This is a remorse, and the more you listen, the more annoyed. 诲矣耳,可关雎. No problem. The second time and the fifth time."); 

                p7.add(L158); 

                JLabel L159 = new JLabel("This is a post-word that can't regret Raoer. I confessed to the sweat and my father came back to Ji'an. After the eavesdropping to the test machine in one place. Le is not kinky to the eleventh back after eavesdropping points. Khan is like rain jade If you don't ask Ji'an, your father will come back and take it back. You can see it. You can see it. Jade, you don't ask your father to come back to Ji'an and sweat. It's the first time back to the seventh time. Let's go to the fourth time. It can be a matter of fact: After the ear."); 

                p7.add(L159); 

                BackStory.getContentPane().add(p7); 

                break; 

 

            default: 

                System.out.println("Sweet mother of monkey milk"); 

                break; 

 

 

 

 

 

 

        } 

         

        BackStory.setVisible(true); 

 

    } 

 

 

 

    public void addactionlistener() { 

        ent.setBackground(new Color(0,255,0)); 

        tf1.setSize(200, 200); 

        tf1.setBackground(Color.black); 

        tf1.setForeground(Color.white); 

        c1.addActionListener(this); 

        c2.addActionListener(this); 

        c3.addActionListener(this); 

        c4.addActionListener(this); 

        c5.addActionListener(this); 

        BS1.addActionListener(this); 

        BS2.addActionListener(this); 

        BS3.addActionListener(this); 

        BS4.addActionListener(this); 

        BS5.addActionListener(this); 

        c1.setBackground(new Color(185, 185, 255)); 

        c2.setBackground(new Color(145, 145, 255)); 

        c2.setForeground(Color.black); 

        c3.setBackground(new Color(113, 113, 255)); 

        c3.setForeground(Color.white); 

        c4.setBackground(new Color(72, 72, 255)); 

        c4.setForeground(Color.white); 

        c5.setBackground(new Color(0, 0, 255)); 

        c5.setForeground(Color.white); 

        BS1.setBackground(new Color(0, 0, 255)); 

        BS1.setForeground(Color.white); 

        BS2.setBackground(new Color(72, 72, 255)); 

        BS2.setForeground(Color.white); 

        BS3.setBackground(new Color(113, 113, 255)); 

        BS3.setForeground(Color.white); 

        BS4.setBackground(new Color(145, 145, 255)); 

        BS5.setBackground(new Color(185, 185, 255)); 

    } 

    public void acceptuid() { 

 

 

 

        JLabel txt1 = new JLabel("Enter your 6-digit numerical Unique Identification Number"); 

 

        uide.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 

        uide.getContentPane().setBackground(Color.pink); 

        uide.setSize(500, 200); 

        uide.setVisible(true); 

 

        ent.setLayout(new GridLayout(2, 1)); 

        ent.add(txt1); 

        ent.add(tf1); 

        tf1.addActionListener(this); 

 

 

        uide.getContentPane().add(ent); 

 

 

 

 

 

    } 

 

    public void checkuid(int u) { 

 

 

 

        for (int i = 0; i <= 999; i++) //loop searches thru the number array and prints name corresponding to that 

        { 

            if (uniqueidentifcation[i] == u) //checking 

            { 

                if (test[i] == true) //if user enters unentered unid 

                { 

                    JLabel dreuid = new JLabel("You can only vote once!"); 

                    ent.setLayout(new GridLayout(3, 1)); 

                    uide.setVisible(false); 

                    ent.add(dreuid); 

                    uide.getContentPane().add(ent); 

                    try { 

                        Thread.sleep(200); 

                    } catch (InterruptedException ie) {} 

                    uide.setVisible(true); 

                    i--; 

                    break; 

                } else { 

                    nmstr = i; 

 

                    exec2.votingtime(i); 

 

                    test[i] = true; 

 

 

                    break; 

                } 

            } else { 

                continue; 

            } 

        } 

 

 

    } 

    public void votingtime(int vvv) { 

        vtng.setTitle("Welcome " + names[vvv] + "! Vote for your preferred candidate"); 

        vtng.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 

        vtng.getContentPane().setBackground(Color.red); 

        vtng.setSize(600, 750); 

        vtng.setVisible(true); 

 

        p3.setLayout(new GridLayout(5, 2)); 

        p3.add(c1); 

        p3.add(BS1); 

        p3.add(c2); 

        p3.add(BS2); 

        p3.add(c3); 

        p3.add(BS3); 

        p3.add(c4); 

        p3.add(BS4); 

        p3.add(c5); 

        p3.add(BS5); 

 

        vtng.getContentPane().add(p3); 

 

    } 

    public void CountNoOfVotes() { 

        totalcounted++; 

 

    } 

 

    public void R() { 

 

        cf.setTitle("Results of the Election"); 

        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        cf.getContentPane().setBackground(Color.red); 

        cf.setSize(500, 750); 

        String ns = ""; 

        for (int j = 0; j < 5; j++) { 

            for (int k = 0; k < cnames[j].length(); k++) { 

                char ch = cnames[j].charAt(k); 

                char chc = Character.toUpperCase(ch); 

                ns += chc; 

            } 

            cnames[j] = ns; 

            ns = ""; 

        } 

        JButton L1 = new JButton(cnames[0] + " : " + x[0] + " "); 

        JButton L2 = new JButton(cnames[1] + " : " + x[1] + " "); 

        JButton L3 = new JButton(cnames[2] + " : " + x[2] + " "); 

        JButton L4 = new JButton(cnames[3] + " : " + x[3] + " "); 

        JButton L5 = new JButton(cnames[4] + " : " + x[4] + " "); 

        p6.setBackground(new Color(245, 130, 37)); 

        p6.setLayout(new GridLayout(5, 1)); 

        L1.setBackground(new Color(255, 0, 0)); 

        L1.setForeground(new Color(255, 255, 255)); 

        L2.setBackground(new Color(255, 0, 0)); 

        L2.setForeground(new Color(255, 255, 255)); 

        L3.setBackground(new Color(255, 0, 0)); 

        L3.setForeground(new Color(255, 255, 255)); 

        L4.setBackground(new Color(255, 0, 0)); 

        L4.setForeground(new Color(255, 255, 255)); 

        L5.setBackground(new Color(255, 0, 0)); 

        L5.setForeground(new Color(255, 255, 255)); 

 

 

        if (x[0] > x[1] && x[0] > x[2] && x[0] > x[3] && x[0] > x[4]) { 

            L1.setBackground(new Color(0, 255, 0)); 

            L1.setForeground(new Color(0, 0, 0)); 

        } 

        if (x[1] > x[0] && x[1] > x[2] && x[1] > x[3] && x[1] > x[4]) { 

            L2.setBackground(new Color(0, 255, 0)); 

            L2.setForeground(new Color(0, 0, 0)); 

        } 

 

        if (x[2] > x[0] && x[2] > x[1] && x[2] > x[3] && x[2] > x[4]) { 

            L3.setBackground(new Color(0, 255, 0)); 

            L3.setForeground(new Color(0, 0, 0)); 

        } 

 

        if (x[3] > x[0] && x[3] > x[1] && x[3] > x[2] && x[3] > x[4]) { 

 

            L4.setBackground(new Color(0, 255, 0)); 

            L4.setForeground(new Color(0, 0, 0)); 

        } 

        if (x[4] > x[0] && x[4] > x[1] && x[4] > x[2] && x[4] > x[3]) { 

            L5.setBackground(new Color(0, 255, 0)); 

            L5.setForeground(new Color(0, 0, 0)); 

        } 

        p6.add(L1); 

        p6.add(L2); 

        p6.add(L3); 

        p6.add(L4); 

        p6.add(L5); 

        cf.getContentPane().add(p6); 

        cf.setVisible(true); 

    } 

    public static void main(String[] args) throws IOException { 

        exec2.addactionlistener(); 

        exec2.acceptuid(); 

 

    } 

 

 

    public void actionPerformed(ActionEvent e) { 

        int i; 

 

        if (e.getSource() == tf1) { 

            ueid = tf1.getText(); 

            int a1 = Integer.parseInt(ueid); 

 

            tf1.setText(""); 

            exec2.checkuid(a1); 

 

 

 

        } 

        if (e.getSource() == c1) { 

            x[0]++; 

 

 

            exec2.CountNoOfVotes(); 

            if (totalcounted >= 7) { 

 

 

 

                exec2.R(); 

 

            } 

            vtng.dispatchEvent(new WindowEvent(vtng, WindowEvent.WINDOW_CLOSING)); 

        } 

        if (e.getSource() == c2) { 

            x[1]++; 

 

            exec2.CountNoOfVotes(); 

            if (totalcounted >= 7) { 

 

 

                exec2.R(); 

            } 

            vtng.dispatchEvent(new WindowEvent(vtng, WindowEvent.WINDOW_CLOSING)); 

        } 

        if (e.getSource() == c3) { 

            x[2]++; 

 

            exec2.CountNoOfVotes(); 

            if (totalcounted >= 7) { 

 

 

                exec2.R(); 

 

            } 

            vtng.dispatchEvent(new WindowEvent(vtng, WindowEvent.WINDOW_CLOSING)); 

        } 

        if (e.getSource() == c4) { 

            x[3]++; 

 

 

            if (totalcounted >= 7) { 

 

                exec2.R(); 

 

            } 

            vtng.dispatchEvent(new WindowEvent(vtng, WindowEvent.WINDOW_CLOSING)); 

        } 

        if (e.getSource() == c5) { 

            x[4]++; 

 

            exec2.CountNoOfVotes(); 

            if (totalcounted >= 7) { 

 

                exec2.R(); 

 

            } 

            vtng.dispatchEvent(new WindowEvent(vtng, WindowEvent.WINDOW_CLOSING)); 

        } 

        if(e.getSource() == BS1) 

        { 

            exec2.backstory(0); 

        } 

        if(e.getSource() == BS2) 

        { 

            exec2.backstory(1); 

        } 

        if(e.getSource() == BS3) 

        { 

            exec2.backstory(2); 

        } 

        if(e.getSource() == BS4) 

        { 

            exec2.backstory(3); 

        } 

        if(e.getSource() == BS5) 

        { 

            exec2.backstory(4); 

        } 

    } 

 

    String names[] = { 

        "Abbey Stanton", 

        "Abbie Peck", 

        "Abby Ferrell", 

        "Abdullah Flowers", 

        "Abel Young", 

        "Abigayle Horton", 

        "Abraham Pham", 

        "Ace Jensen", 

        "Ada Kramer", 

        "Adalynn Mccall", 

        "Adan Hines", 

        "Adan Sellers", 

        "Addison Compton", 

        "Addison Doyle", 

        "Addisyn Benitez", 

        "Addyson Thompson", 

        "Adeline Joseph", 

        "Adelyn Mcgrath", 

        "Aden Wyatt", 

        "Aditya Mitchell", 

        "Adolfo Todd", 

        "Adonis Spencer", 

        "Adrian Shaw", 

        "Adriel Richardson", 

        "Adrienne Harrell", 

        "Adrienne Wilkins", 

        "Aiden Arnold", 

        "Aiden Dunn", 

        "Aisha Mercer", 

        "Aiyana Nicholson", 

        "Alana Freeman", 

        "Alannah Freeman", 

        "Alanna Shannon", 

        "Alberto Decker", 

        "Aleena Spence", 

        "Aleena Swanson", 

        "Alejandra Dean", 

        "Alejandra Webb", 

        "Alejandro Lester", 

        "Alena Harding", 

        "Alexa Ho", 

        "Alexander Wallace", 

        "Alexandra Fuentes", 

        "Alex Duarte", 

        "Alexzander Harrell", 

        "Aliana Mahoney", 

        "Alia Orozco", 

        "Alice Brennan", 

        "Ali Ortega", 

        "Alisa Forbes", 

        "Alisha Rodgers", 

        "Alison Brennan", 

        "Alissa Simmons", 

        "Alivia Daniel", 

        "Alivia Roberts", 

        "Allan Landry", 

        "Allen Anderson", 

        "Allison Steele", 

        "Allyson Williams", 

        "Alma Gibbs", 

        "Alonzo Shannon", 

        "Alvin Kent", 

        "Alvin Mcbride", 

        "Alyssa Crawford", 

        "Alyssa Weaver", 

        "Amanda Wilcox", 

        "Amari Velazquez", 

        "Amirah Middleton", 

        "Amiyah Nixon", 

        "Amya Bright", 

        "Amy Blankenship", 

        "Anabel Drake", 

        "Anabella Atkinson", 

        "Anabella Spencer", 

        "Anabelle Hood", 

        "Anahi Flynn", 

        "Anastasia Casey", 

        "Angela French", 

        "Angela George", 

        "Angelica Schmitt", 

        "Angel Liu", 

        "Angelo Wheeler", 

        "Annabella Parks", 

        "Annalise Hudson", 

        "Anne Richardson", 

        "Annie Cole", 

        "Annie Stark", 

        "Annie Warren", 

        "Annika Hardin", 

        "Ann Pollard", 

        "Antonio Briggs", 

        "Anya Murillo", 

        "Arianna Neal", 

        "Arianna Snyder", 

        "Ari Browning", 

        "Ariel Cabrera", 

        "Ariella Oconnor", 

        "Ariella Salas", 

        "Armani Duarte", 

        "Armani Stein", 

        "Arnav Trujillo", 

        "Arturo Davis", 

        "Arturo Simpson", 

        "Aryan Davila", 

        "Aryanna Walter", 

        "Asa Buckley", 

        "Asa Higgins", 

        "Asa Hurst", 

        "Asher Leach", 

        "Ashlynn Haynes", 

        "Asia Gates", 

        "Aurora Orr", 

        "Averie Hanna", 

        "Avery Harrison", 

        "Avery Villa", 

        "Axel Duran", 

        "Ayaan Cain", 

        "Ayaan Tapia", 

        "Ayanna Chambers", 

        "Ayden Juarez", 

        "Aydin Woods", 

        "Ayla Valenzuela", 

        "Aylin Woods", 

        "Bailey Bradshaw", 

        "Bailey Fletcher", 

        "Bailey Fry", 

        "Barbara Marsh", 

        "Beatrice Ryan", 

        "Beatrice Tate", 

        "Beau Reid", 

        "Beckett Cummings", 

        "Beckham Lozano", 

        "Benjamin Krueger", 

        "Ben Mason", 

        "Bianca Harvey", 

        "Blaze Berg", 

        "Bo Oconnor", 

        "Bradley Dillon", 

        "Bradley Lawrence", 

        "Braeden Stuart", 

        "Braedon Burch", 

        "Braiden Kennedy", 

        "Branson Ramsey", 

        "Brayan Bass", 

        "Braydon Beasley", 

        "Braydon Watkins", 

        "Braylon Dougherty", 

        "Brennen Poole", 

        "Bria Aguirre", 

        "Bria Howe", 

        "Bridger Ball", 

        "Bridger Chan", 

        "Bridger Mcdowell", 

        "Bridger Medina", 

        "Brisa Grant", 

        "Brisa Mullins", 

        "Britney Soto", 

        "Britney Villarreal", 

        "Brock Little", 

        "Broderick Scott", 

        "Brogan Vang", 

        "Brooklynn Koch", 

        "Bruno Barr", 

        "Bryan Crawford", 

        "Bryan Powers", 

        "Bryant Garner", 

        "Bryce Lang", 

        "Brycen Mahoney", 

        "Cade Duran", 

        "Cade French", 

        "Cael Murphy", 

        "Cael Short", 

        "Cailyn Fitzgerald", 

        "Caleb Rice", 

        "Cali Bautista", 

        "Cali Potter", 

        "Callie Ryan", 

        "Cameron Armstrong", 

        "Camilla Cobb", 

        "Carissa Curtis", 

        "Carlos Blankenship", 

        "Case Avery", 

        "Cash Pace", 

        "Cason Shields", 

        "Cassidy Bean", 

        "Catherine Pittman", 

        "Cayden Schmitt", 

        "Caylee Christian", 

        "Caylee Contreras", 

        "Celeste Pollard", 

        "Cesar Wright", 

        "Chaim Moon", 

        "Chandler Wall", 

        "Charity Fields", 

        "Charles Blake", 

        "Charlie Ballard", 

        "Charlotte Hardy", 

        "Cherish Vazquez", 

        "Cherish Wiley", 

        "Christian Fry", 

        "Christian Sparks", 

        "Christine Horne", 

        "Christine Payne", 

        "Cindy Fritz", 

        "Clarence Decker", 

        "Clare Trujillo", 

        "Clayton Ramos", 

        "Clinton Hebert", 

        "Colby Yu", 

        "Cole Wood", 

        "Cora Carter", 

        "Cordell Cruz", 

        "Cordell Ramos", 

        "Corinne Roy", 

        "Cristina Taylor", 

        "Cullen Miller", 

        "Cynthia Brock", 

        "Cyrus Mayo", 

        "Dahlia Ingram", 

        "Dalia Barrett", 

        "Dallas Hernandez", 

        "Dalton Luna", 

        "Damari Montgomery", 

        "Damarion Atkins", 

        "Damarion Henson", 

        "Damaris Cardenas", 

        "Damian Vazquez", 

        "Damion Clayton", 

        "Damion Hernandez", 

        "Damon Farrell", 

        "Dane Powell", 

        "Dangelo Hall", 

        "Daniella Allen", 

        "Daniella Chase", 

        "Danielle Richardson", 

        "Danna Prince", 

        "Dante Charles", 

        "Dante Fuller", 

        "Dante Mercado", 

        "Dario Warren", 

        "Darius Douglas", 

        "Darnell Ho", 

        "Darnell Pearson", 

        "Darnell Weaver", 

        "David Jenkins", 

        "Davin Peters", 

        "Davis Carlson", 

        "Dawson Snow", 

        "Dax Rojas", 

        "Dayami Stevens", 

        "Deacon Riley", 

        "Dean Pittman", 

        "Declan Gilbert", 

        "Declan Mullen", 

        "Demarion Brown", 

        "Derek Anthony", 

        "Derrick Hardin", 

        "Desmond Nolan", 

        "Devan Reilly", 

        "Devin Chang", 

        "Devon Baxter", 

        "Dexter Acosta", 

        "Dillon Rhodes", 

        "Dominik Morgan", 

        "Dominique Cruz", 

        "Donna Jacobson", 

        "Drake Hawkins", 

        "Drake Sexton", 

        "Draven Khan", 

        "Dustin Montoya", 

        "Dustin Webb", 

        "Dustin West", 

        "Dwayne Cervantes", 

        "Eddie Berry", 

        "Eden Ochoa", 

        "Eden Petersen", 

        "Eden Townsend", 

        "Eduardo Guerra", 

        "Edward Poole", 

        "Efrain Sherman", 

        "Elaine Ortega", 

        "Elianna Holder", 

        "Eliezer Andrade", 

        "Eliezer Monroe", 

        "Elijah Hodges", 

        "Elijah Mclaughlin", 

        "Eli Parsons", 

        "Elisabeth Hobbs", 

        "Elisa Day", 

        "Elisa Griffith", 

        "Elise Bowen", 

        "Elizabeth Andrade", 

        "Elizabeth Delacruz", 

        "Ella Vang", 

        "Ellen Oneal", 

        "Elliana Johns", 

        "Elliott Miranda", 

        "Elvis Pace", 

        "Emery Cuevas", 

        "Emery Le", 

        "Emery Mullins", 

        "Emery Whitehead", 

        "Emilee Oneill", 

        "Emilie Cameron", 

        "Emilio Sullivan", 

        "Emily Wolf", 

        "Emmalee Cohen", 

        "Emmanuel Randolph", 

        "Erica Hogan", 

        "Erica Richards", 

        "Erick Nelson", 

        "Erika Pugh", 

        "Erin Day", 

        "Ernest Lang", 

        "Ernesto Barker", 

        "Esmeralda Riggs", 

        "Esperanza Mcclain", 

        "Ethen Waters", 

        "Eve Crawford", 

        "Eve Guerra", 

        "Evelin Long", 

        "Evelyn Greer", 

        "Evelyn Robertson", 

        "Evie Stout", 

        "Ezra Randall", 

        "Fatima Boyer", 

        "Fatima Thompson", 

        "Felix Sanchez", 

        "Finley Bass", 

        "Finley Berry", 

        "Finnegan Lynch", 

        "Finn Mclean", 

        "Fisher Sanchez", 

        "Fletcher Barnes", 

        "Fletcher Choi", 

        "Fletcher Mcknight", 

        "Frances Bryan", 

        "Francesca Middleton", 

        "Frances Collins", 

        "Frankie Spencer", 

        "Franklin Bryant", 

        "Frederick Hodge", 

        "Frida Serrano", 

        "Gabriel Hinton", 

        "Gabriella Gilbert", 

        "Gage Best", 

        "Gaige Preston", 

        "Garrett Hughes", 

        "Gaven Mills", 

        "Genevieve Hart", 

        "Georgia Cline", 

        "Georgia Mason", 

        "Geovanni Reyes", 

        "Geovanni Welch", 

        "Gerald Calderon", 

        "Giana Carey", 

        "Giana Stephenson", 

        "Giana Tapia", 

        "Gianni Blankenship", 

        "Gilbert Juarez", 

        "Gilberto Fletcher", 

        "Gillian Hayes", 

        "Giovanna Hood", 

        "Giovanni Freeman", 

        "Giovanny Santana", 

        "Gisselle Reed", 

        "Glenn Galloway", 

        "Grace Burton", 

        "Grace Castro", 

        "Greta Dougherty", 

        "Greta Ortega", 

        "Greyson Buchanan", 

        "Griffin Thomas", 

        "Guadalupe Rich", 

        "Gunner Mcbride", 

        "Hadassah Gregory", 

        "Hadley Freeman", 

        "Hadley Grant", 

        "Haiden Booth", 

        "Haiden Grant", 

        "Haiden Weber", 

        "Hailey Thomas", 

        "Hailie Cobb", 

        "Hailie Nixon", 

        "Halle Pearson", 

        "Halle Rosario", 

        "Hamza Finley", 

        "Harley Curry", 

        "Harper Gallagher", 

        "Hayden Collier", 

        "Haylie Gibbs", 

        "Heather Park", 

        "Heather Rose", 

        "Hector Ray", 

        "Heidi Ali", 

        "Heidy Chapman", 

        "Helen Mathews", 

        "Hezekiah Erickson", 

        "Holden Barnett", 

        "Howard Forbes", 

        "Hudson Best", 

        "Ian Braun", 

        "Ibrahim Bradford", 

        "Ibrahim Cantrell", 

        "Ibrahim Hogan", 

        "Imani Baird", 

        "Imani Best", 

        "Immanuel Nielsen", 

        "India Higgins", 

        "Irene Romero", 

        "Isaac Petty", 

        "Isaac Werner", 

        "Isabelle Bird", 

        "Isabelle Castro", 

        "Isaias Hill", 

        "Isaias Knight", 

        "Isla Gilmore", 

        "Isla Hughes", 

        "Ismael Boyle", 

        "Ivy Mccarthy", 

        "Iyana Khan", 

        "Iyana Mayer", 

        "Izabelle Wilkins", 

        "Izabelle Wright", 

        "Izaiah Hood", 

        "Izaiah Richmond", 

        "Izayah Gay", 

        "Jabari Mcfarland", 

        "Jace Blevins", 

        "Jacey Haney", 

        "Jack Berry", 

        "Jack Cole", 

        "Jack Erickson", 

        "Jack Patterson", 

        "Jacquelyn Ray", 

        "Jaden Mcdaniel", 

        "Jagger Scott", 

        "Jaiden Parker", 

        "Jairo Benson", 

        "Jakayla Meza", 

        "Jake Frye", 

        "Jakob Vang", 

        "Jaliyah Phelps", 

        "Jamarion Shea", 

        "Jamari Sparks", 

        "James Cross", 

        "Jamir Downs", 

        "Jamison Ibarra", 

        "Jamiya Blair", 

        "Jamiya Stark", 

        "Jamya Shaw", 

        "Janae Murphy", 

        "Janelle Parker", 

        "Janet Mccarty", 

        "Janiya Dyer", 

        "Janiyah Gregory", 

        "Jan Weaver", 

        "Jaqueline Robbins", 

        "Jared Le", 

        "Jaron Boyd", 

        "Jarrett Lin", 

        "Jase Roth", 

        "Jasiah Glover", 

        "Jaslene Holloway", 

        "Jaslyn Short", 

        "Jasmin Montoya", 

        "Jasmin Sawyer", 

        "Jason Duarte", 

        "Jasper Marshall", 

        "Javion Bennett", 

        "Jax Holland", 

        "Jayce Marquez", 

        "Jayda Clark", 

        "Jaydan Mathis", 

        "Jayden Wong", 

        "Jaydin Chandler", 

        "Jaylah Hoover", 

        "Jaylan Mccoy", 

        "Jaylee Holmes", 

        "Jaylene Carr", 

        "Jaylen Farmer", 

        "Jaylen Joseph", 

        "Jaylon Galvan", 

        "Jaylon Rosales", 

        "Jayson Wagner", 

        "Jazlyn Ewing", 

        "Jazlynn Arias", 

        "Jazmine Bowen", 

        "Jazmine Schultz", 

        "Jazmyn Espinoza", 

        "Jean Hawkins", 

        "Jenna Cowan", 

        "Jenna Villegas", 

        "Jeramiah Contreras", 

        "Jeremy Golden", 

        "Jerimiah Dalton", 

        "Jermaine Campos", 

        "Jerry Hood", 

        "Jesus Snyder", 

        "Jett Duran", 

        "Jimena Graham", 

        "Jimena Huber", 

        "Jimmy Coleman", 

        "Jocelyn Santos", 

        "Joe Holden", 

        "Joe Singleton", 

        "Johan Arias", 

        "John Page", 

        "Jonathan Ellis", 

        "Jon Cervantes", 

        "Jordan Hammond", 

        "Jorden Allen", 

        "Jorden Pierce", 

        "Jordyn Bray", 

        "Jordyn Cohen", 

        "Josephine Vega", 

        "Jose Rojas", 

        "Jose Small", 

        "Joslyn Cantrell", 

        "Joslyn Jennings", 

        "Josue Baird", 

        "Jovany Maxwell", 

        "Jude Mcmillan", 

        "Julia Hooper", 

        "Juliana Reese", 

        "Julian Knapp", 

        "Julianna Gill", 

        "Julien Mcbride", 

        "Julissa Serrano", 

        "Julius Fields", 

        "Julius Meadows", 

        "Kadence Woodard", 

        "Kaden Hardy", 

        "Kadyn Levine", 

        "Kaeden Mejia", 

        "Kai Dorsey", 

        "Kaitlyn Andersen", 

        "Kale Mcgee", 

        "Kaley Jenkins", 

        "Kaliyah Long", 

        "Kamari Austin", 

        "Kamari Davila", 

        "Kamari Preston", 

        "Kamden Dawson", 

        "Kamryn Barry", 

        "Kane Little", 

        "Kane Orr", 

        "Kara Glover", 

        "Kara Haney", 

        "Kareem Noble", 

        "Kareem Ruiz", 

        "Karen Perry", 

        "Karen Prince", 

        "Karson Lopez", 

        "Karter Ritter", 

        "Kasey Duncan", 

        "Kasey Landry", 

        "Kasey Nunez", 

        "Kasey Wright", 

        "Kash Fisher", 

        "Kash Martinez", 

        "Kason Ingram", 

        "Kassandra Coffey", 

        "Kathryn Crawford", 

        "Kaya Sanders", 

        "Kaydence Jensen", 

        "Kaydence Pacheco", 

        "Kaylah Galvan", 

        "Kayla Saunders", 

        "Kayla Walter", 

        "Kaylee Gonzales", 

        "Kayleigh Gibbs", 

        "Kaylen Bowman", 

        "Kaylen Edwards", 

        "Kaylen Rasmussen", 

        "Kayley Russo", 

        "Kaylie Stein", 

        "Kaylin Boyer", 

        "Kaylyn Duran", 

        "Keaton Adkins", 

        "Keaton Mcgrath", 

        "Keira Marshall", 

        "Keith King", 

        "Kellen Ali", 

        "Kellen Hampton", 

        "Kelton Hunter", 

        "Kendall Herman", 

        "Kendall Singh", 

        "Kendrick Larson", 

        "Kennedi Cook", 

        "Kennedy Day", 

        "Kenya Dominguez", 

        "Kenya Rios", 

        "Keshawn Crosby", 

        "Kevin Stephenson", 

        "Keyon Larsen", 

        "Keyon Mcintosh", 

        "Khalil Valentine", 

        "Kiana Aguilar", 

        "Kianna Pollard", 

        "Kiersten Hendrix", 

        "Kimberly Reid", 

        "Kimora Daniel", 

        "Kimora Livingston", 

        "Kinley Wyatt", 

        "Kody Key", 

        "Kolby Lamb", 

        "Kolby Long", 

        "Konner Sparks", 

        "Korbin Jacobs", 

        "Kristen Flowers", 

        "Kristin Hooper", 

        "Kristin Parrish", 

        "Kristopher Bates", 

        "Kyla Hodge", 

        "Kyla Wilkinson", 

        "Kylee Johns", 

        "Kyleigh Bullock", 

        "Kyle Walter", 

        "Kylie Beasley", 

        "Kymani Kramer", 

        "Lainey Ware", 

        "Lana Stuart", 

        "Laney Sampson", 

        "Laura Alexander", 

        "Lauren Collier", 

        "Layla Haas", 

        "Lea Clarke", 

        "Lee Camacho", 

        "Leonardo Cisneros", 

        "Leonard Stokes", 

        "Leonel Mays", 

        "Leonidas Moore", 

        "Leslie Jones", 

        "Leticia Travis", 

        "Levi Buckley", 

        "Levi Hodges", 

        "Lewis Acosta", 

        "Lewis Perkins", 

        "Lexi Adams", 

        "Lexi Todd", 

        "Lia Clayton", 

        "Lia Ewing", 

        "Libby Carlson", 

        "Libby Pittman", 

        "Lilah Pollard", 

        "Lilian Kirk", 

        "Lilian Mcdonald", 

        "Lilian Morgan", 

        "Lillianna Miller", 

        "Lillie Mason", 

        "Lincoln Harris", 

        "Linda French", 

        "Linda Oneill", 

        "Lizeth Hill", 

        "Logan Buckley", 

        "Logan Hendrix", 

        "Lola Stone", 

        "Lorelai Werner", 

        "Louis Crawford", 

        "Lucia Higgins", 

        "Luciano Irwin", 

        "Luis Fuentes", 

        "Lukas Tanner", 

        "Luka Tyler", 

        "Luke Flores", 

        "Luke Page", 

        "Luna Cervantes", 

        "Maci Price", 

        "Mackenzie Davila", 

        "Madden Barnett", 

        "Madelyn Shaw", 

        "Madison Delgado", 

        "Magdalena Dean", 

        "Maggie Harding", 

        "Maggie Knox", 

        "Makaila Blair", 

        "Makaila Henson", 

        "Makenzie Maldonado", 

        "Makhi Benson", 

        "Malachi Whitney", 

        "Malakai Campbell", 

        "Malakai Vazquez", 

        "Malaki Mathews", 

        "Malcolm Barry", 

        "Manuel Key", 

        "Manuel Underwood", 

        "Marc Choi", 

        "Marcelo Perry", 

        "Marc Morgan", 

        "Marco Andrade", 

        "Marco Ewing", 

        "Marcos Flowers", 

        "Marcos Mason", 

        "Marco Waller", 

        "Mariana Huff", 

        "Marianna Lynch", 

        "Maribel Ingram", 

        "Marie Barker", 

        "Mariela Johnson", 

        "Mariela Powers", 

        "Marilyn Morales", 

        "Marin Hood", 

        "Mario Carr", 

        "Marisa Montes", 

        "Marisol Ray", 

        "Marissa Horton", 

        "Maritza Wagner", 

        "Mariyah Morrison", 

        "Marley Reid", 

        "Marques Burke", 

        "Marquis Lowery", 

        "Martha Snyder", 

        "Martin Rivera", 

        "Marvin Blair", 

        "Mason Fuentes", 

        "Mason Roberts", 

        "Mathew Marquez", 

        "Matias Watts", 

        "Matthew Choi", 

        "Maurice Barron", 

        "Max Crosby", 

        "Maximillian Mercer", 

        "Maximo Beard", 

        "Maximo Glass", 

        "Maximo Howe", 

        "Maya Rush", 

        "Mckenna Sanders", 

        "Megan Ferrell", 

        "Meghan Horn", 

        "Melanie Benitez", 

        "Melina Cross", 

        "Mercedes Peck", 

        "Meredith Hendrix", 

        "Mia Massey", 

        "Micaela Mccann", 

        "Micah Cohen", 

        "Michael Oconnor", 

        "Micheal Cobb", 

        "Miguel Benitez", 

        "Miguel Berry", 

        "Miguel Carson", 

        "Miguel Russell", 

        "Mikayla Atkinson", 

        "Mikayla Noble", 

        "Mike Castaneda", 

        "Mila Oconnell", 

        "Miley Mcmahon", 

        "Milton Berg", 

        "Miracle Hoover", 

        "Mireya Stuart", 

        "Miriam Macdonald", 

        "Mohammad Watts", 

        "Mohammed Cole", 

        "Mollie Black", 

        "Molly Krause", 

        "Monica Arroyo", 

        "Monica Wilkinson", 

        "Monique Everett", 

        "Muhammad Burton", 

        "Myah Stanley", 

        "Mya Poole", 

        "Myla Brady", 

        "Myla Fischer", 

        "Mylie Skinner", 

        "Naima Cole", 

        "Nancy Mccann", 

        "Nash Trujillo", 

        "Nasir Kemp", 

        "Natalee Austin", 

        "Natalia Hensley", 

        "Natalie Levy", 

        "Natalie Lucas", 

        "Natalya Hunt", 

        "Nataly Khan", 

        "Nathalie Skinner", 

        "Nathaly Wilcox", 

        "Nathanial Moran", 

        "Nathaniel Graves", 

        "Nehemiah Hernandez", 

        "Nehemiah Stark", 

        "Nick Jimenez", 

        "Nick Lawrence", 

        "Nicolas Colon", 

        "Nikolas Velasquez", 

        "Niko Roy", 

        "Nina Mcdowell", 

        "Noel Bird", 

        "Nora Esparza", 

        "Nora Marshall", 

        "Nyasia Harrison", 

        "Nylah Collins", 

        "Nylah Stout", 

        "Octavio Dickerson", 

        "Odin Hernandez", 

        "Oliver Bond", 

        "Omar Ellison", 

        "Omar Houston", 

        "Omari Kaufman", 

        "Omari Kent", 

        "Paityn Wells", 

        "Paloma Yang", 

        "Paola Wells", 

        "Paris Cortez", 

        "Parker Andrews", 

        "Parker Hinton", 

        "Patricia Duran", 

        "Patricia Krueger", 

        "Paula Oliver", 

        "Paul Manning", 

        "Paxton Gay", 

        "Payton Sullivan", 

        "Pedro Blevins", 

        "Pedro Huber", 

        "Perla Morgan", 

        "Perla Weiss", 

        "Philip Buchanan", 

        "Philip Miles", 

        "Phillip Lee", 

        "Phoebe Haney", 

        "Porter Logan", 

        "Precious Woods", 

        "Quentin Hayes", 

        "Quinn Daniel", 

        "Quintin Beasley", 

        "Quintin Mathis", 

        "Rafael Tyler", 

        "Raiden Lambert", 

        "Rashad Mcpherson", 

        "Raul Shaw", 

        "Rayne Rhodes", 

        "Rayne Weeks", 

        "Reagan Ball", 

        "Reece Cohen", 

        "Reed Clayton", 

        "Reed Patel", 

        "Regan Adkins", 

        "Regan Hale", 

        "Reina Davenport", 

        "Remington Thornton", 

        "Rene Shannon", 

        "Rex Reeves", 

        "Rey Blevins", 

        "Reyna Arellano", 

        "Rhett Malone", 

        "Rhianna Ibarra", 

        "Rhianna Richards", 

        "Rigoberto Rojas", 

        "Riley Larson", 

        "Riley Tanner", 

        "Rishi Lutz", 

        "Robert Roman", 

        "Rodney Houston", 

        "Rodney Hull", 

        "Rogelio James", 

        "Romeo Cannon", 

        "Ronin Avery", 

        "Ronnie James", 

        "Roselyn Bishop", 

        "Roselyn Kane", 

        "Rosemary Huynh", 

        "Ross Oconnor", 

        "Rowan Avery", 

        "Ruby Garrett", 

        "Rudy Ayala", 

        "Rudy Coffey", 

        "Rudy Solomon", 

        "Rudy Wilkins", 

        "Rudy Wood", 

        "Ryan Riddle", 

        "Ryker Christensen", 

        "Ryland Mckenzie", 

        "Rylee Daniel", 

        "Rylee Maddox", 

        "Rylee Sparks", 

        "Sage Rasmussen", 

        "Saige Donaldson", 

        "Salma Osborn", 

        "Salvatore Rocha", 

        "Salvatore Weber", 

        "Samara Chung", 

        "Samara Sparks", 

        "Samara Velazquez", 

        "Sam Hines", 

        "Sammy Brooks", 

        "Saniyah Chavez", 

        "Saniyah Golden", 

        "Santino Curry", 

        "Sarai Mahoney", 

        "Sara Sandoval", 

        "Saul Duarte", 

        "Savanah Brennan", 

        "Savion Blair", 

        "Scarlett Pennington", 

        "Selina Mcconnell", 

        "Semaj Ramsey", 

        "Shaniya Ford", 

        "Shaniya Ponce", 

        "Shawn Armstrong", 

        "Shayla Rich", 

        "Shayna Holland", 

        "Shayna Miles", 

        "Shiloh Mata", 

        "Shyanne Travis", 

        "Shyla Eaton", 

        "Sidney Harrington", 

        "Sidney Stanley", 

        "Siena Larson", 

        "Sierra Wise", 

        "Sincere Sandoval", 

        "Skye Pham", 

        "Skyla Foley", 

        "Skyla Sampson", 

        "Skyler Madden", 

        "Slade Cisneros", 

        "Sofia Hensley", 

        "Sonia Sims", 

        "Sophia Livingston", 

        "Soren Peck", 

        "Spencer Watts", 

        "Stella Eaton", 

        "Stella Flores", 

        "Steve Anderson", 

        "Sullivan Fuentes", 

        "Summer Holloway", 

        "Sydney Burch", 

        "Tabitha Myers", 

        "Talia Gonzalez", 

        "Tamia Dickerson", 

        "Tania Casey", 

        "Tanner Burnett", 

        "Tara Mcguire", 

        "Tatum Ford", 

        "Tatum Schroeder", 

        "Taylor Palmer", 

        "Teagan Summers", 

        "Terrell Charles", 

        "Tess Palmer", 

        "Tess Todd", 

        "Thalia Cantrell", 

        "Thalia Wiggins", 

        "Theresa Knight", 

        "Thomas Long", 

        "Tia Dawson", 

        "Tia Serrano", 

        "Tiffany Donaldson", 

        "Titus Briggs", 

        "Titus Maynard", 

        "Toby Mosley", 

        "Todd Cain", 

        "Todd Quinn", 

        "Tony Eaton", 

        "Trace Craig", 

        "Trace Hammond", 

        "Trent Bean", 

        "Trenton Hendrix", 

        "Tristen Dillon", 

        "Tristian Delacruz", 

        "Tyree Michael", 

        "Tyrell O'Connor", 

        "Tyrone Guerrero", 

        "Ulises Blanchard", 

        "Uriel Ibarra", 

        "Valentin Webb", 

        "Valery Washington", 

        "Vance Jefferson", 

        "Vance Rush", 

        "Van Griffin", 

        "Vaughn Houston", 

        "Vaughn Montgomery", 

        "Veronica Wall", 

        "Vicente Fischer", 

        "Viviana Arroyo", 

        "Viviana Meza", 

        "Viviana Reid", 

        "Walker Obrien", 

        "Walter Maddox", 

        "Wendy Davies", 

        "Whitney Gamble", 

        "Will Miles", 

        "Willow Stephenson", 

        "Xander Cervantes", 

        "Ximena Wells", 

        "Xiomara Duke", 

        "Xiomara Gordon", 

        "Yadira Nicholson", 

        "Yair Bond", 

        "Yamilet David", 

        "Yaretzi Acosta", 

        "Yaretzi Rice", 

        "Yoselin Boyer", 

        "Zachary Lozano", 

        "Zachery Sutton", 

        "Zackary Jimenez", 

        "Zackery Hobbs", 

        "Zaiden Mccall", 

        "Zaid Hahn", 

        "Zaire Nixon", 

        "Zander Morgan", 

        "Zoey Harris" 

    }; 

    int uniqueidentifcation[] = { 

        119993, 

        120731, 

        121016, 

        121754, 

        123633, 

        124371, 

        124657, 

        127274, 

        127727, 

        128248, 

        128297, 

        129606, 

        131367, 

        131889, 

        133247, 

        133985, 

        134270, 

        136887, 

        137340, 

        137911, 

        139219, 

        139957, 

        140243, 

        142860, 

        143883, 

        144621, 

        146500, 

        146953, 

        147524, 

        148832, 

        149570, 

        149856, 

        150594, 

        152473, 

        153211, 

        153496, 

        154756, 

        156114, 

        157137, 

        158446, 

        159184, 

        159469, 

        162086, 

        162824, 

        163110, 

        163848, 

        164369, 

        165727, 

        166701, 

        166750, 

        168059, 

        169082, 

        170341, 

        171699, 

        172437, 

        172723, 

        173461, 

        173982, 

        175340, 

        175793, 

        176363, 

        177672, 

        178695, 

        179433, 

        181313, 

        182051, 

        182336, 

        183074, 

        183595, 

        184953, 

        185406, 

        185927, 

        185977, 

        187285, 

        188309, 

        189568, 

        190926, 

        191664, 

        191949, 

        194566, 

        195019, 

        195540, 

        195590, 

        196898, 

        197922, 

        199181, 

        200539, 

        201277, 

        201562, 

        202300, 

        204180, 

        204632, 

        205154, 

        205203, 

        206512, 

        207250, 

        207535, 

        210152, 

        211176, 

        213793, 

        214816, 

        216125, 

        216863, 

        217148, 

        218407, 

        219765, 

        220503, 

        220789, 

        221527, 

        222048, 

        223406, 

        223859, 

        224429, 

        225738, 

        226761, 

        227499, 

        228021, 

        229379, 

        230117, 

        230402, 

        233019, 

        233472, 

        233993, 

        234043, 

        235351, 

        236089, 

        236374, 

        237112, 

        237634, 

        238992, 

        239730, 

        240015, 

        240753, 

        241274, 

        242632, 

        243085, 

        243606, 

        243656, 

        244964, 

        245988, 

        246726, 

        247247, 

        248605, 

        249343, 

        249628, 

        250366, 

        252246, 

        252698, 

        253269, 

        254578, 

        255601, 

        256339, 

        258218, 

        259242, 

        259979, 

        260501, 

        261859, 

        262882, 

        264191, 

        264929, 

        265214, 

        265952, 

        267831, 

        268569, 

        268855, 

        269593, 

        271472, 

        271925, 

        272446, 

        272495, 

        273804, 

        274542, 

        274827, 

        277445, 

        278183, 

        278468, 

        281085, 

        283417, 

        284155, 

        284440, 

        285700, 

        287058, 

        288081, 

        288819, 

        289340, 

        290698, 

        291151, 

        291672, 

        293030, 

        293768, 

        294054, 

        296671, 

        297409, 

        297694, 

        298432, 

        300312, 

        302644, 

        303382, 

        303667, 

        304405, 

        304926, 

        306284, 

        307022, 

        307308, 

        308567, 

        309925, 

        310899, 

        312257, 

        312995, 

        313280, 

        314018, 

        314539, 

        315897, 

        316635, 

        316921, 

        317659, 

        319538, 

        319991, 

        321870, 

        322608, 

        322893, 

        324153, 

        325511, 

        326249, 

        326534, 

        327272, 

        329151, 

        329604, 

        330125, 

        331483, 

        332506, 

        333244, 

        333766, 

        335124, 

        335862, 

        336147, 

        337406, 

        338194, 

        338764, 

        339738, 

        341096, 

        341834, 

        342120, 

        342858, 

        343379, 

        344737, 

        345475, 

        345760, 

        346498, 

        347807, 

        348378, 

        348830, 

        350710, 

        351448, 

        351733, 

        352471, 

        352992, 

        354350, 

        355088, 

        355373, 

        356111, 

        356633, 

        357420, 

        357991, 

        360323, 

        361061, 

        361346, 

        363963, 

        364701, 

        364987, 

        366246, 

        367033, 

        367604, 

        368057, 

        368578, 

        369936, 

        370959, 

        373577, 

        375859, 

        376647, 

        377217, 

        377670, 

        379549, 

        380287, 

        380572, 

        381832, 

        383190, 

        384213, 

        386260, 

        386830, 

        387283, 

        387804, 

        389162, 

        390186, 

        391445, 

        392803, 

        393541, 

        393826, 

        394564, 

        395086, 

        395873, 

        396444, 

        398776, 

        399514, 

        399799, 

        400537, 

        401058, 

        402416, 

        403154, 

        403439, 

        404699, 

        405486, 

        406057, 

        408389, 

        409412, 

        410150, 

        410671, 

        412029, 

        412767, 

        413053, 

        413791, 

        414312, 

        415099, 

        415670, 

        418002, 

        418740, 

        419025, 

        420285, 

        421643, 

        422381, 

        422666, 

        425283, 

        425736, 

        426257, 

        427615, 

        428353, 

        428638, 

        429376, 

        431256, 

        431994, 

        432279, 

        433017, 

        433538, 

        434896, 

        435349, 

        435870, 

        437228, 

        437966, 

        438252, 

        439511, 

        440869, 

        441607, 

        441892, 

        442630, 

        443939, 

        444510, 

        445484, 

        446842, 

        447580, 

        447865, 

        449124, 

        450482, 

        451220, 

        451505, 

        452765, 

        453552, 

        454123, 

        454575, 

        456455, 

        457478, 

        460095, 

        460833, 

        461119, 

        461857, 

        463165, 

        463736, 

        466068, 

        466806, 

        467091, 

        467829, 

        468351, 

        469709, 

        470447, 

        470732, 

        471470, 

        471991, 

        472779, 

        473349, 

        473802, 

        474323, 

        475681, 

        476419, 

        476704, 

        477442, 

        477964, 

        479322, 

        480060, 

        480345, 

        481604, 

        482392, 

        482962, 

        483936, 

        485294, 

        486318, 

        487056, 

        487577, 

        488935, 

        489673, 

        489958, 

        490696, 

        491218, 

        492576, 

        493550, 

        494908, 

        495646, 

        495931, 

        496669, 

        498548, 

        499286, 

        499571, 

        500309, 

        501618, 

        502189, 

        502641, 

        503163, 

        504521, 

        505259, 

        505544, 

        506282, 

        506803, 

        508161, 

        508899, 

        509185, 

        509923, 

        510444, 

        511231, 

        511802, 

        512255, 

        512776, 

        514134, 

        515157, 

        515895, 

        517775, 

        518513, 

        518798, 

        519536, 

        520844, 

        521130, 

        521415, 

        522389, 

        523747, 

        524770, 

        527388, 

        528126, 

        528411, 

        529149, 

        530458, 

        530743, 

        531028, 

        531481, 

        533360, 

        534098, 

        534384, 

        535122, 

        537001, 

        537739, 

        538024, 

        538762, 

        539284, 

        540071, 

        540356, 

        540642, 

        541094, 

        542974, 

        543712, 

        543997, 

        544735, 

        545256, 

        546614, 

        547352, 

        547637, 

        548375, 

        549969, 

        550255, 

        550707, 

        551229, 

        552587, 

        553325, 

        553610, 

        554869, 

        556227, 

        556965, 

        557251, 

        559583, 

        559868, 

        560321, 

        562200, 

        562938, 

        563223, 

        565841, 

        566864, 

        568910, 

        569196, 

        569481, 

        569934, 

        571813, 

        572551, 

        572836, 

        573574, 

        575454, 

        576192, 

        576477, 

        578524, 

        578809, 

        579094, 

        579547, 

        581426, 

        582164, 

        582450, 

        583709, 

        585067, 

        585805, 

        586090, 

        587350, 

        588137, 

        588422, 

        588708, 

        589160, 

        591040, 

        591778, 

        592063, 

        592801, 

        593322, 

        594680, 

        595418, 

        595703, 

        596963, 

        598035, 

        598321, 

        598773, 

        599295, 

        600653, 

        601391, 

        601676, 

        604293, 

        605031, 

        605317, 

        607363, 

        607649, 

        607934, 

        608387, 

        610266, 

        611004, 

        611289, 

        612027, 

        612549, 

        613907, 

        614645, 

        614930, 

        616976, 

        617262, 

        617547, 

        619879, 

        620617, 

        620902, 

        621640, 

        622162, 

        623520, 

        624543, 

        626875, 

        627160, 

        629492, 

        630230, 

        630516, 

        631254, 

        631775, 

        633133, 

        633871, 

        634156, 

        636203, 

        636488, 

        636774, 

        637226, 

        639106, 

        639844, 

        640129, 

        640867, 

        642746, 

        643484, 

        643769, 

        646101, 

        646387, 

        646839, 

        647361, 

        648719, 

        649742, 

        651001, 

        652359, 

        653097, 

        653383, 

        655429, 

        655715, 

        656000, 

        656453, 

        656974, 

        658332, 

        659070, 

        659355, 

        661973, 

        662711, 

        662996, 

        665328, 

        665613, 

        666066, 

        667945, 

        668683, 

        668968, 

        669706, 

        671586, 

        672324, 

        672609, 

        674656, 

        674941, 

        675226, 

        675679, 

        676200, 

        677558, 

        678582, 

        679841, 

        681199, 

        682222, 

        684269, 

        684554, 

        684840, 

        685814, 

        687172, 

        688195, 

        688933, 

        689454, 

        690812, 

        691550, 

        691835, 

        693882, 

        694167, 

        694453, 

        694905, 

        695427, 

        696785, 

        697523, 

        697808, 

        700425, 

        701163, 

        701449, 

        703495, 

        703781, 

        704519, 

        705040, 

        706398, 

        707136, 

        707421, 

        708681, 

        710039, 

        710777, 

        711062, 

        713108, 

        713394, 

        714132, 

        714653, 

        716011, 

        716749, 

        717034, 

        719652, 

        720390, 

        720675, 

        722722, 

        723007, 

        723745, 

        725624, 

        726648, 

        727386, 

        727907, 

        729265, 

        730003, 

        730288, 

        732335, 

        732620, 

        733358, 

        735237, 

        736261, 

        736999, 

        737520, 

        738878, 

        739616, 

        739901, 

        741948, 

        742233, 

        744851, 

        745589, 

        745874, 

        746612, 

        747133, 

        748491, 

        749515, 

        751561, 

        751847, 

        754464, 

        755202, 

        755487, 

        758105, 

        758842, 

        759128, 

        761174, 

        761460, 

        762198, 

        762719, 

        764077, 

        764815, 

        765100, 

        765838, 

        767718, 

        768741, 

        770788, 

        771073, 

        772332, 

        773690, 

        774714, 

        775452, 

        777331, 

        778354, 

        780401, 

        780686, 

        781424, 

        781946, 

        783303, 

        784041, 

        784327, 

        785065, 

        785586, 

        786944, 

        787682, 

        787967, 

        790299, 

        792917, 

        793655, 

        793940, 

        794678, 

        795199, 

        796557, 

        797295, 

        797581, 

        799627, 

        799913, 

        800651, 

        801172, 

        802530, 

        803268, 

        803553, 

        804291, 

        806171, 

        806908, 

        807194, 

        809240, 

        809526, 

        810264, 

        812143, 

        812881, 

        813166, 

        813904, 

        815784, 

        816522, 

        816807, 

        818854, 

        819139, 

        820398, 

        821756, 

        822494, 

        822780, 

        823518, 

        825397, 

        825850, 

        826135, 

        826420, 

        828467, 

        828752, 

        829490, 

        831369, 

        832393, 

        835010, 

        835748, 

        836033, 

        838080, 

        838365, 

        839625, 

        840983, 

        841721, 

        842006, 

        844623, 

        845076, 

        845361, 

        845597, 

        845647, 

        847693, 

        847979, 

        848717, 

        849238, 

        850596, 

        851334, 

        851619, 

        852357, 

        854236, 

        854689, 

        854974, 

        855260, 

        857306, 

        857592, 

        860209, 

        860947, 

        861232, 

        861970, 

        862492, 

        863850, 

        864302, 

        864824, 

        864873, 

        866920, 

        867205, 

        867943, 

        868464, 

        869822, 

        870560, 

        870846, 

        872105, 

        873463, 

        873916, 

        874201, 

        874486, 

        876818, 

        877556, 

        879435, 

        880173, 

        880459, 

        883076, 

        884099, 

        886146, 

        886431, 

        887169, 

        887691, 

        889049, 

        889787, 

        890072, 

        891331, 

        892689, 

        893142, 

        893427, 

        893713, 

        896045, 

        897304, 

        898662, 

        899685, 

        900423, 

        900945, 

        902302, 

        902755, 

        903040, 

        903326, 

        905372, 

        905658, 

        906396, 

        908275, 

        909013, 

        909298, 

        910558, 

        911916, 

        912368, 

        912890, 

        912939, 

        914986, 

        915271, 

        916009, 

        916530, 

        917888, 

        918626, 

        918912, 

        920171, 

        921529, 

        921982, 

        922267, 

        922552, 

        924884, 

        926144, 

        927501, 

        928239, 

        928525, 

        931142, 

        931595, 

        932116, 

        932165, 

        934212, 

        934497, 

        935235, 

        937115, 

        938138, 

        939397, 

        940755, 

        941208, 

        941493, 

        941729, 

        941779, 

        943087, 

        943825, 

        944111, 

        944849, 

        946728, 

        947466, 

        947751, 

        948489, 

        949011, 

        950368, 

        950821, 

        951392, 

        952700, 

        953438, 

        953724, 

        954462, 

        954983, 

        956341, 

        957079, 

        957364, 

        958102, 

        958624, 

        959982, 

        960434, 

        961005, 

        962314, 

        963052, 

        963337, 

        964075, 

        965954, 

        966692, 

        966978, 

        968237, 

        969595, 

        970048, 

        970333, 

        970618, 

        971927, 

        972665, 

        972950, 

        973688, 

        975567, 

        976305, 

        976591, 

        977329, 

        979208, 

        979661, 

        979946, 

        980231, 

        981540, 

        982563, 

        985181, 

        985919, 

        986204, 

        988821, 

        989274, 

        989559, 

        989845, 

        991153, 

        992177, 

        992915, 

        993436, 

        994794, 

        995532, 

        995817, 

        996555, 

        997077, 

        998434, 

        999408, 

        999458 

    }; 

 

} 