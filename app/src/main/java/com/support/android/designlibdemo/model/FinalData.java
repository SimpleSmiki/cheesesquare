package com.support.android.designlibdemo.model;

import com.support.android.designlibdemo.R;

import java.util.Arrays;

public class FinalData {

    static Question o1q1 = new Question("Желите ли да сазнате да ли грешке младих возача имају заједничке особине?", "Доказано је да саобраћајне незгоде младих возача имају неке заједничке особине.");
    static Question o1q2 = new Question("Желите ли да сазнате разлику између ризичног понашања и несвесне вожње?", "Ризично понашање је намеран чин, док је непажљива вожња несвесна акција.");

    static CategoryObject o1 = new CategoryObject("Грешке младих возача", "•\tНепажљива вожња: мобилни телефони, музика, храна и смс поруке могу озбиљно да деконцентришу возаче. Непажљива вожња узрок је судара на путу у чак 80 одсто случајева.\n" +
            "•\tПревише ризична вожња: Активности као што су игнорисања саобраћајних знакова или престројавања без провере мртвих углова убрајају се у ''ризично понашање“. \n" +
            "•\tБрза вожња: Већина возача повремено вози брзо, али тинејџери то чине, јер олако схватају како брзина којом возе може да утиче на брзину њихове реакције. \n" +
            "•\tПревише особа у возилу: Млади људи врло често претрпавају своја возила, што често резултира агресивнијом вожњом и недостатком концентрације.\n" +
            "•\tВожња у алкохолизираном стању: Када млади људи пију и возе, мање је вероватно да ће бити у стању да се придржавати безбедносних правила.  \n" +
            "•\tОпасно приближавање другим возилима: Одржавање прописане удаљености измедју возила је један од битних услова за спречавању несрећа.\n" +
            "•\tВожња без појаса: Велики број младих возача не користи редовно појас, иако скоро сва нова возила имају уграђене аларме који возаче подсећају да морају да се вежу.\n" +
            "•\tНеспособност за адекватне реакције у хитним случајевима: Јер се само са искуством на путу може научити како да се избегне саобраћајна несрећа. Непредвиђених саобраћајних ситуација је огромни број и због тога се тешко могу научити у ауто школама. \n" +
            "•\tВожња у поспаном стању: Вожња у поспаном стању односи се на групу тзв. ''добре деце'', тј. одличних ученика са велики бројем ваншколских активности. \n" +
            "•\tПогрешан избор аута и лоше одржавање: Комбинација малог буџета и високог стила живота тера тинејџере да жртвују важне безбедносне елементе за јачи мотор и украсне делове. Уколико потроше читав буџет на куповину аутомобила, штедеће на његовом одржавању.\n" +
            "•\tКоришћење мобилних телефона током вожње: било за комуникацију, било за фотографисање.",R.drawable.cheese_1, Arrays.asList(o1q1, o1q2), "http://www.nesto.com");

    static Question o2q1 = new Question("Желите да сазнате у којој мери понашање утиче на безбедност у саобраћају? ", "Подаци говоре да понашање човека узрокује незгоде у преко 90% случајева. ");
    static Question o2q2 = new Question("Желите да сазнате о типовима личности чије црте указују на повећан ризик од удеса?", "Истраживања издвајају пет типова личности.");
    static CategoryObject o2 = new CategoryObject("Особине, личности и понашање", "Понашање возача се схвата као скуп одређених навика, склоности и емоционалних реакција приликом вожње, а укључује и евалуацију квалитета сопствене вожње. Понашање возача у саобраћају је врло сложено јер укључује реакције на већи број истовремених информација у ситуацијама које се стално мењају. Од квалитета и брзине реаговања возача зависиће његова безбедност и безбедност других учесника у саобраћају.\n" +
            "\n" +
            "Истраживања која су се бавила понашањем возача као издвојеним феноменом сугеришу да повезаност између особина личности и понашања возача постоји, и да природа те повезаности углавном подржава став да се људи приликом вожње понашају на сличан начин као и у другим ситуацијама. Као добри индикатори показали су се: \n" +
            "а) бес приликом вожње, \n" +
            "б) тражење сензација, \n" +
            "в) емоционална стабилност,\n" +
            "г) пријатност,\n" +
            "д) отвореност ка искуству.\n" +
            "\n" +
            "Отвореност је показала повезаност са ризичном вожњом, а пријатност са губљењем контроле над возилом, док је емоционална стабилност предвиђала агресивну вожњу. Тражење сензација се показало као добар индикатор низа карактеристика, као што су ризична неагресивна вожња, агресивна вожња, губљење концентрације при вожњи, мање незгоде и озбиљније несреће у саобраћају.",R.drawable.cheese_1, Arrays.asList(o2q1, o2q2), "http://www.nesto.com");

    static CategoryObject o3 = new CategoryObject("Нова категоризација", "АМ \tМопеди, лаки трицикли или четвороцикли. Право полагања са 16 година старости.\n" +
            "А-1 \tМотоцикли запремине до 125 кубних центиметара и тешки трицикли снаге мотора \tдо 15 кW. \tПраво полагања са 16 година.\n" +
            "А-2 \tМотоцикли снаге мотора до 35 кW. Право полагања са 18 година.\n" +
            "А \tМотицикли и тешки трицикли снаге мотора веће од 35 кW. Право полагања са 24 \tгодине.\n" +
            "B-1 \tТешки четвороцикли. Право полагања са 18 година. \n" +
            "B \tМоторна возила масе до 3 500 кг и до 8 седишта. Право полагања са 18 \tгодина. \n" +
            "BЕ \tВозила чије вучно возило припада категорији Б, а маса прикључног возила је од \t750 до 3500 кг. Право полагања са 18 година. \n" +
            "C-1 \tМоторна возила чија је највећа дозвољена маса од 3 500 до 7 500 кг. Право \tполагања са 18 година. \n" +
            "C-1Е \tВозила чије вучно возило спада у категорије Ц или C-1, а највећа дозвољена \tмаса \tприкључног возила прелази 750 кг. Право полагања са 18 година. \n" +
            "C\tМоторна возила осим категорија А, А-1, А-2, АМ, F, М, B, односно возила чија \tнајвећа \tдозвољена маса прелази 3 500 кг. Возилу може да се дода \tприколица чија маса не прелази 750 кг. \n" +
            "D-1\tМоторна возила са 8 до 16 седишта, и чија дужина не прелази 8м. Право \tполагања са 21 годином. \n" +
            "D-1Е\tВозила чије вучно возило припада категорији D-1, а маса прикључног возила је \tвећа од 750 \tкг. Право полагања са 21 годином. \n" +
            "D\tМоторна возила за превоз људи, која осим седишта возача имају више од осам \tседишта. \tПраво полагања са 24 године. \n" +
            "DЕ\tВозила чије вучно возило припада категорији D, а маса прикључног возила је \tвећа од 750 \tкг. Право полагања 24 године.\n" +
            "F\tТрактори са или без прикључних возила и радне машине.",R.drawable.cheese_1, Arrays.asList(o1q1, o1q2), "http://www.nesto.com");
//    static CategoryObject o4 = new CategoryObject(R.drawable.cheese_4, R.drawable.cheese_4, "Budjavi sir", "desc");
//    static CategoryObject o5 = new CategoryObject(0, R.drawable.cheese_5, "Mocarela", "To je jedan opak sir");

    static Category oneCat1 = new Category("За младе возаче", "desc", Arrays.asList(o1, o2, o3), Arrays.asList(o1q1, o1q2));


    static Question o4q1 = new Question("Желите да сазнате који су стадијуми алкохолизма? ", "Има их шест и иду од стања пролазне опијености до коматозног стања.");
    static Question o4q2 = new Question("Желите да сазнате на које све органе делује алкохол?", "Он првенствено делује на мозак, десни, плућа, руке, јетру, ноге, изазива болове у стомаку, бубрезима, желуцу, срцу итд.");
    static CategoryObject o4 = new CategoryObject("Утицај алкохола", "....",R.drawable.cheese_1, Arrays.asList(o4q1, o4q2), "http://www.nesto.com");

    static Question o5q1 = new Question("Желите да сазнате у којој мери понашање утиче на безбедност у саобраћају? ", "Подаци говоре да понашање човека узрокује незгоде у преко 90% случајева. ");
    static Question o5q2 = new Question("Желите да сазнате о типовима личности чије црте указују на повећан ризик од удеса?", "Истраживања издвајају пет типова личности.");
    static CategoryObject o5 = new CategoryObject("Психичка секунда", "....",R.drawable.cheese_1, Arrays.asList(o5q1, o5q2), "http://www.nesto.com");

    static Question o6q1 = new Question("Желите да сазнате колико је особа потребно за извлачење особе из возила у поступку пружања прве помоћи? ", "За извлачење повређеног из возила потребне су најмање три особе које морају радити уз највећи могући опрез. ");
    static Question o6q2 = new Question("Желите да сазнате колики је нормалан ритам дисања?", "Нормалан ритам дисања је 12 до 16 пута у минути.");
    static CategoryObject o6 = new CategoryObject("Прва помоћ", "....",R.drawable.cheese_1, Arrays.asList(o6q1, o6q2), "http://www.nesto.com");

    static Question o7q1 = new Question("Желите да сазнате какви поремећаји настају употребом алкохола? ", "Сви поремећаји који настају под дејством алкохола на организам могу сврстати у три основне групе:\t а) поремећај структуре личности, \n" +
            "\t б) поремећај перцепције и психомоторике,\n" +
            "\t в) поремећај функције чулних органа.  ");
    static Question o7q2 = new Question("Желите да сазнате шта је сомоскривљена неурачунљивост и како је третира наш закон?", "Самоскривљена неурачунљивост, је посебан институт материјалног кривичног права и означава радњу слободну у одлуци, али неслободну у учињењу, те представља изузетак од правила непостојања кривичне одговорности због недостатка елемента урачунљивости. ");
    static CategoryObject o7 = new CategoryObject("Кривична одговорност за конзумирање алкохола", "...",R.drawable.cheese_1, Arrays.asList(o7q1, o7q2), "http://www.nesto.com");

    static Question o8q1 = new Question("Желите да сазнате како алкохол утиче на чула возача? ", "Рецимо, Трезан возач види саобраћајни знак на 140 метара удаљености, док алкохолисан на свега 118 метара. ");
    static Question o8q2 = new Question("Желите да сазнате да ли је пиво шкодљиво?", "Погрешно је мишљење да пиво није шкодљиво. Пиво поред концентрације алкохола од 6% има и благ успављујући ефекат.");
    static CategoryObject o8 = new CategoryObject("Алкохолисани возачи", "....",R.drawable.cheese_1, Arrays.asList(o8q1, o8q2), "http://www.nesto.com");

    static Question o9q1 = new Question("Желите да сазнате у којој мери понашање утиче на безбедност у саобраћају? ", "Подаци говоре да понашање човека узрокује незгоде у преко 90% случајева. ");
    static Question o9q2 = new Question("Желите да сазнате о типовима личности чије црте указују на повећан ризик од удеса?", "Истраживања издвајају пет типова личности.");
    static CategoryObject o9 = new CategoryObject("Алкометар", "...",R.drawable.cheese_1, Arrays.asList(o9q1, o9q2), "http://www.nesto.com");

    static Category oneCat2 = new Category("Безбедно понашање", "desc", Arrays.asList(o4,o5,o6,o7,o8,o9), Arrays.asList(o4q1, o4q2,o5q1,o5q2,o6q1,o6q2,o7q1,o7q2,o8q1,o9q1,o9q2));


    static Category oneCat3 = new Category("Знакови", "desc", Arrays.asList(o2, o3), Arrays.asList(o1q1, o1q2));

    static Category oneCat4 = new Category("Упитник", "desc", Arrays.asList(o2, o3), Arrays.asList(o1q1, o1q2));

    public static final CategoryContainer one = new CategoryContainer("Mladi u saobracaju", Arrays.asList(oneCat1, oneCat2, oneCat3, oneCat4));

    static Category twoCat1 = new Category("Обавезно осигурање путника", "desc", Arrays.asList(o1, o2, o3), Arrays.asList(o1q1, o1q2));
    static Category twoCat2 = new Category("Кривичноправна одговорност", "desc", Arrays.asList(o1), Arrays.asList(o1q1, o1q2));
    static Category twoCat3 = new Category("Неке од казни", "desc", Arrays.asList(o2, o3), Arrays.asList(o1q1, o1q2));
    static Category twoCat4 = new Category("Накнада штете", "desc", Arrays.asList(o2, o3), Arrays.asList(o1q1, o1q2));
    static Category twoCat5 = new Category("Како наплатити штету", "desc", Arrays.asList(o2, o3), Arrays.asList(o1q1, o1q2));

    public static final CategoryContainer two = new CategoryContainer("Prekrsaji", Arrays.asList(twoCat1, twoCat2, twoCat3, twoCat4, twoCat5));

    static Category threeCat1 = new Category("Безбедност деце", "desc", Arrays.asList(o1, o2, o3), Arrays.asList(o1q1, o1q2));
    static Category threeCat2 = new Category("Бициклизам", "desc", Arrays.asList(o1), Arrays.asList(o1q1, o1q2));
    static Category threeCat3 = new Category("Анализе", "desc", Arrays.asList(o2, o3), Arrays.asList(o1q1, o1q2));
    static Category threeCat4 = new Category("Занимљивости", "desc", Arrays.asList(o2, o3), Arrays.asList(o1q1, o1q2));
    static Category threeCat5 = new Category("Догађаји", "desc", Arrays.asList(o2, o3), Arrays.asList(o1q1, o1q2));

    public static final CategoryContainer three = new CategoryContainer("Aktivizam", Arrays.asList(threeCat1, threeCat2, threeCat3, threeCat4, threeCat5));

}
