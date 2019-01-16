package Lesson12.magazine;

public class Main {
    public static void main(String [] args) {
        Photo photo = new Photo();
        photo.setAlert("Кастрюля 7,0 литров с рисунком СТАЛЬЭМАЛЬ Сталь эмалированная");
        photo.setPath("https://kupit-skovorodu.ru/upload/iblock/0f2/52.jpg");

        Photo photo1 = new Photo();
        photo1.setAlert("Кастрюля 7,0 литров с рисунком СТАЛЬЭМАЛЬ Сталь эмалированная");
        photo1.setPath("https://kupit-skovorodu.ru/upload/iblock/0f2/52.jpg");


        Xarakteristika xarakteristika = new Xarakteristika();
        xarakteristika.setDiametr(26);
        xarakteristika.setObiem(7);
        xarakteristika.setMaterial("Сталь эмалированная");
        xarakteristika.setSize("выс. 16 см");
        xarakteristika.setWeight("1900 г");

        Tovar yellowCastrulya = new Tovar();
        yellowCastrulya.setMainName("Кастрюля 7,0 литров с рисунком СТАЛЬЭМАЛЬ Сталь эмалированная");
        yellowCastrulya.setArticul("1с18с");
        yellowCastrulya.setPrice(790);
        yellowCastrulya.setXarakteristika(xarakteristika);
        yellowCastrulya.setPhotoMain(photo);
        yellowCastrulya.setShortInfo("Кастрюля эмалированная \"СтальЭмаль\" изготовлена из высококачественного стального проката, покрытого двумя слоями жаропрочной эмали.");
        yellowCastrulya.setMainInfo("О товаре\n" +
                "Посуда выполнена из тонколистового стального проката, покрытого двумя слоями эмали. Эмалевое покрытие имеет существенные преимущества по показателям безопасности влияния на организм человека, санитарным свойствам, простоте ухода и рассчитан на длительный срок эксплуатации. Оно устойчиво к перепадам температуры до 220°С, обладает высокой механической прочностью, противостоит воздействию пищевых кислот. \n" +
                "Эмалированную посуду нельзя ронять, нагревать без жидкости, допускать замерзания в ней жидкости, чистить металлической мочалкой. \n" +
                "Пригодно для использования на всех видах плит, включая индукционные. Можно мыть в посудомоечной машине.\n" +
                "\n" +
                "Посуда снабжена удобными ручками и крышкой. Внешние стенки декорированы изображением клубники. \n" +
                "Подходит для всех типов плит, включая индукционные. \n" +
                "\n" +
                "Ширина (с учетом ручек): 33 см. \n" +
                "Высота стенки: 16 см.");

        yellowCastrulya.addPhotoToPhotos(photo);
        yellowCastrulya.addPhotoToPhotos(photo1);

        System.out.println(yellowCastrulya);


        Photo photo2 = new Photo();
        photo2.setAlert("Чайник 1,5 литра с рисунком ЭМАЛЬ Сталь эмалированная");
        photo2.setPath("https://kupit-skovorodu.ru/upload/iblock/ff9/61.jpg");

        Photo photo3 = new Photo();
        photo3.setAlert("Чайник 1,5 литра с рисунком ЭМАЛЬ Сталь эмалированная");
        photo3.setPath("https://kupit-skovorodu.ru/upload/iblock/ff9/61.jpg");


        Xarakteristika xarakteristikaTeaPot = new Xarakteristika();
        xarakteristika.setObiem(1.5);
        xarakteristika.setWeight("600 г");

        Tovar whiteTeaPot = new Tovar();
        whiteTeaPot.setMainName("Чайник 1,5 литра с рисунком ЭМАЛЬ Сталь эмалированная");
        whiteTeaPot.setArticul("01-2708/4 ");
        whiteTeaPot.setPrice(590);
        whiteTeaPot.setXarakteristika(xarakteristika);
        whiteTeaPot.setPhotoMain(photo2);
        whiteTeaPot.setShortInfo("Чайник  имеет внешнее высокопрочное эмалевое покрытие. Эстетичный и функциональный чайник будет оригинально смотреться в любом интерьере.\n");
        whiteTeaPot.setMainInfo("О товаре\n" +
                "Посуда выполнена из тонколистового стального проката, покрытого двумя слоями эмали. Эмалевое покрытие имеет существенные преимущества по показателям безопасности влияния на организм человека, санитарным свойствам, простоте ухода и рассчитан на длительный срок эксплуатации. Оно устойчиво к перепадам температуры до 220°С, обладает высокой механической прочностью, противостоит воздействию пищевых кислот. \n" +
                "Эмалированную посуду нельзя ронять, нагревать без жидкости, допускать замерзания в ней жидкости, чистить металлической мочалкой. \n" +
                "Предметы набора пригодны для использования на всех видах плит, включая индукционные. Можно мыть в посудомоечной машине.");

        whiteTeaPot.addPhotoToPhotos(photo2);
        whiteTeaPot.addPhotoToPhotos(photo3);

        System.out.println(whiteTeaPot);

        Filter.printCheapestTovar(yellowCastrulya, whiteTeaPot);
    }
    }


