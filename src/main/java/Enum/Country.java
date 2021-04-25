package Enum;

public class Country {

    final private String ruName;
    final private boolean isOpen;
    final private String englName;


    public Country(String ruName, boolean isOpen, String englName) {
        this.ruName = ruName;
        this.isOpen = isOpen;
        this.englName = englName;
    }

    public String getruName() {                                                        //  гет ruName
        return ruName;
    }


    public boolean getisOpen() {                                                       //  гет isOpen
        return isOpen;
        }


        @Override
        public String toString() {
            return englName;
        }


        public void printstatus () {

            if (getisOpen()) {

                System.out.println("Страна: " + toString() + " открыта для посещения");
            } else {
                System.out.println("Страна: " + toString() + " для посещения закрта");
            }
        }

    }
