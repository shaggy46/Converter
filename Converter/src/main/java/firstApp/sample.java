/**Public class MainClass {

    Private
    static final Map<ConverterTypeEnum, Converter> converters = new HashMap<>();

    {

        converters.put(ConverterTypeEnum.KG_TO_LB, new KgToLbConverter());
…..i tak samo kazdy konverter

    }

    Public

    static void main(String[] args) {

        ConverterTypeEnum converterType = pobierzArgumentOdUseraIzmienGoNaEnum(args);

        Converter converter = converters.get(converterType);

        Long result = converter.convert(value < -to pobierz od usera);
    }

    Public

    static ConverterTypeEnum pobierzArgumentOdUseraIzmienGoNaEnum(String[] args) {
// implement me
    }
}

    Public interface Converter {
// tu mozna dodac jakies stale pomocnicze wspoldzielone przez konwertery, albo metody jezeli beda wspoldzielone
// i wtedy zmienic interfejs na klase abstrakcyjna

        Long convert(Long value);

    }

    Public  class KgToLBConverter implements Converter {

        Public Long convert(Long value) {
            // implement me
        }

    }


    Public enum ConverterTypeEnum {

// nie musi byc tego w nawiasie ale moze latwiej komunikowac sie z userem przez to co w nawiasie - trzeba
//
// dorobic wtedy tez konstruktor itd (kompilator Ci sie zaswieci, wygoogluj jak to zrobic)

        KG_TO_LB(„1”);

    } **/