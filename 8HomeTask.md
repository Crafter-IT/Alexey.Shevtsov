//Alexey.Shevtsov //lesson 8 Home Task

package ru.geekbrains.java1.lesson8;

//import com.sun.java.util.jar.pack.Instruction; //import com.sun.org.apache.bcel.internal.generic.SWITCH;

import javax.swing.; import java.awt.; import java.awt.event.MouseAdapter; import java.awt.event.MouseEvent; import java.awt.event.WindowAdapter; import java.awt.event.WindowEvent;

public class Form extends JFrame {

private String S, SS, SX;
private int I, II;


public Form() {


    setBounds(500, 200, 800, 600);
    setTitle("ГОРОСКОП");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3, 1));


    JPanel[] jp = new JPanel[3];
    for (int i = 0; i < 3; i++) {
        jp[i] = new JPanel();
        this.add(jp[i]);
        jp[i].setBackground(new Color(100 + i * 40, 100 + i * 40, 100 + i * 40));
    }


    jp[0].setLayout(new FlowLayout());
    String[] comboStr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    String[] comboStr2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};


    JComboBox<String> jcombo1 = new JComboBox<>(comboStr);
    JComboBox<String> jcombo2 = new JComboBox<>(comboStr2);
    jp[0].add(jcombo1);
    jp[0].add(jcombo2);


    jcombo1.addActionListener(e -> {
        System.out.println(jcombo1.getSelectedItem().toString());
    });


    jcombo2.addActionListener(e -> {
        System.out.println(jcombo2.getSelectedItem().toString());
    });

    for (; ; ) {


        S = jcombo1.getSelectedItem().toString();
        SS = jcombo2.getSelectedItem().toString();
        I = Integer.parseInt(S);
        II = Integer.parseInt(SS);


        if (I > 21) {
            II += 1;
        }
        if (II == 7) {
            II = 1;
        }

        switch (II) {
            case 1:
                SX = "     Козерог      " + "\n" + " Трудолюбие, здравомыслие и правильная оценка собственных возможностей – " + "\n" + "три кита успеха Козерогов. Благодаря этим качествам представители знака справляются со всеми жизненными трудностями и " + "\n" + "добиваются поставленных целей. Козероги не склонны к легкомыслию и неоправданному оптимизму;" + "\n" + " более того, часто они видят свою жизнь в самом мрачном свете, хотя она далеко не плоха.";
                break;
            case 2:
                SX = "      Водолей     " + "\n" + "  Водолеи очень самостоятельны и самодостаточны. Конечно, у них есть друзья, родственники, " + "\n" + "просто близкие люди, но, честно говоря, никто не понимает представителей знака до конца. " + "\n" + "Ход мысли Водолея всегда на удивление извилист, и без подробных объяснений никак не поймешь, " + "\n" + "почему же Водолею удалось прийти к правильному выводу, да еще и сделать  это на удивление быстро. " + "\n" + "У представителей знака очень сильная интуиция, но пользоваться ею правильно им не всегда удается. ";
                break;
            case 3:
                SX = "     Рыбы    " + "\n" + "У Рыб легкий, приятный характер, слегка окрашенный в романтические или меланхолические тона." + "\n" + " Представители знака не отличаются большой жизненной энергией или выдающимся стоицизмом и предпочитают пережидать трудные времена " + "\n" + "за чьими-нибудь широкими плечами," + "\n" + " но на это никто не жалуется. У Рыб огромный запас душевного тепла, поэтому они способны растопить даже ледяное сердце. ";
                break;
            case 4:
                SX = "       Овен" + "\n" + " Под этим знаком появляются на свет неутомимые борцы и неисправимые оптимисты." + "\n" + " Их упрямство достойно войти в пословицы. Чего Овны не любят – " + "\n" + "так это слишком долго заниматься одним делом: уж слишком быстро они «перегорают». " + "\n" + "И в любви все так же: вспышка страсти, головокружительный роман, а затем – охлаждение и поиски нового партнера.";
                break;
            case 5:
                SX = "        Телец" + "\n" + " Тельцы совершенно уверены, что появились на свет для того, чтобы сделать мир лучше," + "\n" + " и в этом они почти не ошибаются. Способность Тельцов украшать и приукрашивать удивительна. " + "\n" + "Там, где за дело берутся представители этого знака, вскоре не остается ничего," + "\n" + " что бы не радовало глаз и не поднимало настроения. " + "\n" + "Но доброжелательные Тельцы становятся совершенно безжалостными, когда кто-то пытается обидеть их близких";
                break;
            case 6:
                SX = "        Близнецы   " + "\n" + "Близнецы многолики, переменчивы и непредсказуемы. С ними всегда весело и интересно, но очень редко бывает спокойно. " + "\n" + "Рутина – главный враг Близнецов, над которыми они регулярно одерживают верх. " + "\n" + "Представители знака наделены незаурядными артистическими талантами. Если Близнецы случайно не работают в театре, " + "\n" + "значит, в театр превратится вся их жизнь.";
                break;
            case 7:
                SX = "      Рак" + "\n" + "   Стихия Раков – душевные порывы, тонкие переживания, высокие чувства. " + "\n" + "Все грубое и материальное представляется им малоинтересным; исключением являются деньги и красивые вещи – " + "\n" + " против них Раки ничего не имеют. Семья для Раков – всегда приоритет. " + "\n" + "О благополучии своих близких представители знака позаботятся в любых обстоятельствах.";
                break;
            case 8:
                SX = "      Лев " + "\n" + "  Львов невозможно не заметить: везде, где появляются представители знака, они оказываются в центре внимания. " + "\n" + "От простых смертных Львов отличает безупречный вкус, а также искренняя (и взаимная) любовь к роскоши." + "\n" + " Можно не любить Льва, но не любоваться им невозможно. " + "\n" + "Неожиданностью для многих оказывается то, что за яркой внешностью скрывается ранимая душа. ";

                break;
            case 9:
                SX = "     Дева" + "\n" + " Считается, что именно под знаком Девы появляются на свет самые умные люди. " + "\n" + "Они не только отличаются незаурядным интеллектом, но и умеют сказать твердое и решительное «нет» тем чувствам и эмоциям, которые считают ненужными." + "\n" + " Дева способна создать прочную и счастливую семью, но едва ли будет чувствовать себя несчастной, " + "\n" + "если останется в одиночестве: представители знака самодостаточны.  ";
                break;
            case 10:
                SX = "    Весы    " + "\n" + "Считается, что Весы нерешительны, но это совсем не так. Они просто принимают во внимание многие факторы – " + "\n" + "в том числе те, которых не замечают представители других знаков, и именно поэтому часто проводят время в размышлениях. " + "\n" + "Кроме того, представители знака отличаются хорошими манерами, дружелюбием и оптимизмом. " + "\n" + "Только очень терпеливый и настойчивый человек способен испортить Весам настроение.";
                break;
            case 11:
                SX = "    Скорпион   " + "\n" + " Скорпионы – сложные, многогранные и очень привлекательные люди. Они способны очаровать любого," + "\n" + " но никогда не делают этого в корыстных целях. Личная жизнь Скорпионов отличается крайней насыщенностью," + "\n" + " ведь именно в водовороте страстей представители данного знака чувствуют себя наиболее комфортно." + "\n" + " Кроме того, сменяющие друг друга бурные романы помогают им избегать даже кратких периодов одиночества – а его Скорпионы ужасно не любят.";
                break;
            case 12:
                SX = "    Стрелец   " + "\n" + " Азарт – вот сила, которая ведет Стрельцов по жизни, порой приводя в сложные, нелепые и смешные ситуации." + "\n" + " Стрельцы не боятся проблем  и неудач; более того – чем более сложная задача стоит перед представителями знака," + "\n" + " тем с большим воодушевлением они берутся за ее решение. Быть другом Стрельца – одно удовольствие, " + "\n" + "любить Стрельца – другое, но ничуть не меньшее. Неудивительно, что Стрельцы всегда окружены теми, кто готов ради них на что угодно.";
                break;

        }


        jp[1].setLayout(new BorderLayout());


        JTextArea jta = new JTextArea(SX);


        JScrollPane jsp = new JScrollPane(jta);


        jp[1].add(jsp);


        setVisible(true);
    }


}
}

//------------------------------------------

package ru.geekbrains.java1.lesson8;

import javax.swing.; import java.awt.;

public class Window { public static void main(String[] args) {

    Form Window = new Form();


}
}
