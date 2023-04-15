package selfwork.enums.task3;

public enum TemperatureConvert {

    C_F('C', 'F', new Converter() {

        @Override
        public float convert(float tempIn) {
            return (tempIn * 9 / 5) + 32;
        }
    }),
    C_K('C', 'K', new Converter() {

        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn - 273.15f;
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9;
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9 + 273.15f;
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn + 32) * 9 / 5 + 273.15f;
        }
    });

   private char input;
   private char output;
   private Converter converter;

    TemperatureConvert(char input, char output, Converter converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }

    public static float convertTemperature(char input, char output, float tempIn) {

        for (TemperatureConvert temperatureConverter : values()){
            if (temperatureConverter.input == input && temperatureConverter.output == output) {
                return temperatureConverter.converter.convert(tempIn);
            }
        }
        return Integer.MIN_VALUE;
    }
}
