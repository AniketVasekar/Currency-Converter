import java.util.Scanner;

class CurrencyConv {
    public static void main(String[] args) {
        System.out.println("Know your currency rate :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount : ");
        float amount = sc.nextFloat();
        System.out.println("1.USD 2.EUR 3.GBP 4.KWD 5.CAD 6.AUD 7.JPY 8.NZD 9.BGN 10.HKD");
        String curr = sc.next().toUpperCase();

        if (curr.equals("USD")) {
            float usd = amount / 83.96f;
            System.out.println(amount + "INR = " + usd + "USD");
        } else if (curr.equals("EUR")) {
            float eur = amount / 92.78f;
            System.out.println(amount + "INR = " + eur + "EUR");
        } else if (curr.equals("GBP")) {
            float gbp = amount / 110.117f;
            System.out.println(amount + "INR = " + gbp + "GBP");
        } else if (curr.equals("KWD")) {
            float kwd = amount / 274.70f;
            System.out.println(amount + "INR = " + kwd + "KWD");
        } else if (curr.equals("CAD")) {
            float cad = amount / 61.69f;
            System.out.println(amount + "INR = " + cad + "CAD");

        } else if (curr.equals("AUD")) {
            float aud = amount / 56.37f;
            System.out.println(amount + "INR = " + aud + "AUD");
        } else if (curr.equals("JPY")) {
            float jpy = amount / 0.57f;
            System.out.println(amount + "INR = " + jpy + "JPY");
        } else if (curr.equals("NZD")) {
            float nzd = amount / 51.93f;
            System.out.println(amount + "INR = " + nzd + "NZD");
        } else if (curr.equals("BGN")) {
            float bgn = amount / 47.47f;
            System.out.println(amount + "INR = " + bgn + "BGN");
        } else if (curr.equals("HKD")) {
            float hkd = amount / 10.76f;
            System.out.println(amount + "INR = " + hkd + "HKD");
        } else {
            System.out.println("Entered Currency is Wrong");
        }

    }

}
