public class Operations {
    private String comment;
    private boolean status;
    final int minNumber;
    final int maxNumber;
    final int aliquotNumber;

    public Operations() {
        comment = "";
        status = false;
        minNumber = 100;
        maxNumber = 200;
        aliquotNumber = 3;
    }

    public void checkNumber(int number) {
        if(number >= minNumber && number <= maxNumber && number % aliquotNumber == 0){
            comment = "Trafiłeś! Podana liczba jest podzielna przez " + aliquotNumber + " oraz należy do przedziału "
                 + "liczb <" + minNumber + "," + maxNumber + ">";
            status = true;
        } else if (number >= minNumber && number <= maxNumber){
            comment = "Blisko. Niestety podana liczba nie jest podzielna przez " + aliquotNumber;
        }else if(number < minNumber){
            comment = "Podana liczba jest za mała";
        }else {
            comment = "Podana liczba jest za duża";
        }
    }

    public String getComment() {
        return comment;
    }

    public boolean isStatus() {
        return status;
    }
}
