package ChapterEleven.AtmbankValidation;

public class AtmTypesValidation {
    private final User person = new User();
    private String number;
    private CardType currentCard;

    public boolean checkIfAtmExist() {
        return true;
    }

    public User getUser() {
        return person;
    }

    public void setAtmNumber(String number) {

        if (number.length() < 13 || number.length() > 16) throw new IllegalArgumentException("Not valid");
        else {
            this.number = number;
            getCardTypeState();
        }
    }

    public String getAtmNumber() {
        return number;
    }

    public int getSize() {
        return number.length();
    }

    public CardType getCardTypeState() {

        if (firstNumberIsFour()) {

            currentCard = CardType.VISA_CARD;
        } else if (Character.getNumericValue(number.charAt(0)) == 5) {
            currentCard = CardType.MASTER_CARD;
        } else if (Character.getNumericValue(number.charAt(0)) == 3 && Character.getNumericValue(number.charAt(1)) == 7) {
            currentCard = CardType.AMERICAN_EXPRESS_CARDS;
        } else if (Character.getNumericValue(number.charAt(0)) == 6) {
            currentCard = CardType.DISCOVER_CARD;
        }


        return null;
    }

    private boolean firstNumberIsFour() {
        return Character.getNumericValue(number.charAt(0)) == 4;
    }

    public String getSecondDigitFRomRight() {
        StringBuilder stringBuilder = new StringBuilder();

        if (number.length() % 2 != 0) {
            for (int i = number.length() - 1; i >= 0; i--) {
                if (i % 2 != 0) {

                    stringBuilder.append(Character.getNumericValue(number.charAt(i)));
                }

            }

        }

        if (number.length() % 2 == 0) {
            for (int i = number.length() - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    stringBuilder.append(Character.getNumericValue(number.charAt(i)));
                }

            }

        }
        return stringBuilder.toString();
    }

    public String getSumOfOddDigit() {
        int sum = 0;
        if (number.length() % 2 != 0) {
            for (int j = number.length() - 1; j >= 0; j--) {
                if (j % 2 != 0) {
                    int collectNumber = Character.getNumericValue(number.charAt(j)) * 2;
                    String sumNumber= String.valueOf(collectNumber);
                    if(collectNumber > 9){
                        collectNumber =Character.getNumericValue(sumNumber.charAt(0)) + Character.getNumericValue(sumNumber.charAt(1));

                    }
                    sum +=collectNumber;


                }
            }

        }
        return String.valueOf(Integer.valueOf(sum));

    }
    public String getSumOfEvenDigit() {
        int sum = 0;
        if (number.length() % 2 == 0) {
            for (int i = number.length() - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    int multiplication = Character.getNumericValue(number.charAt(i)) * 2;
                    String multiply = String.valueOf( multiplication);
                    if (multiplication > 9) {
                        multiplication =Character.getNumericValue(multiply.charAt(0)) + Character.getNumericValue(multiply.charAt(1));

                    }
                    sum += multiplication;

                }
            }
        }
        return String.valueOf(Integer.valueOf(sum));
    }

    public CardType getCurrentCard() {
        return currentCard;
    }
    public String getSumOfEvenAndSumOfOddNumber() {
        int totalSum = 0;
        int sumOfOddNumber = 0;
        int sumOfEvenNumber = 0;
        if (number.length() % 2 != 0) {
            for (int j = number.length() - 1; j >= 0; j--) {
                if (j % 2 != 0) {
                    int collectNumber = Character.getNumericValue(number.charAt(j)) * 2;
                    String sumNumber= String.valueOf(collectNumber);
                    if(collectNumber > 9){
                        collectNumber =Character.getNumericValue(sumNumber.charAt(0)) + Character.getNumericValue(sumNumber.charAt(1));

                    }
                    sumOfOddNumber +=collectNumber;


                }
            }

        }
        if (number.length() % 2 == 0) {
            for (int i = number.length() - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    int multiplication = Character.getNumericValue(number.charAt(i)) * 2;
                    String multiply = String.valueOf( multiplication);
                    if (multiplication > 9) {
                        multiplication =Character.getNumericValue(multiply.charAt(0)) + Character.getNumericValue(multiply.charAt(1));

                    }
                    sumOfEvenNumber += multiplication;

                }
            }
        }
        int totalsum=0;
        totalsum=sumOfEvenNumber+sumOfOddNumber;
        return String.valueOf(Integer.valueOf(totalsum));

    }

}