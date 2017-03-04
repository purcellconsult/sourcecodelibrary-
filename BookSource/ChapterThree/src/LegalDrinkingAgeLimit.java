/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* 
* Figure 3.12: Legal drinking age limit by country. 
* Good program for testing knowledge of conditionals
* in java. 
*
******************************************/

public class LegalDrinkingAgeLimit {

	public static void main(String[] args) {

		String customMessage = "";
		String usCountryCode = "US";
		String ethopiaCountryCode = "ET";
		String franceCountryCode = "FR";
		String germanyCountryCode = "DE";
		String japanCountryCode = "JP";
		String mexicoCountryCode = "MX";
		String ukCountryCode = "GB";

		String personCountry = "US";
		int personAge = 21;

		if (personCountry == "US" && personAge >= 21) {
			customMessage = "cheers";
		}
		if (personCountry == "US" && personAge < 21) {
			customMessage = "sorry";
		}
		if (personCountry == "ET" && personAge >= 18) {
			customMessage = "T'chen chen";
		}
		if (personCountry == "ET" && personAge < 18) {
			customMessage = "Yiqirta";
		}
		if (personCountry == "FR" && personAge >= 18) {
			customMessage = '\u00C0' + "votre sant" + '\u00C0';
		}
		if (personCountry == "FR" && personAge < 18) {
			customMessage = "Pardon";
		}
		if (personCountry == "DE" && personAge >= 16) {
			customMessage = "Prost";
		}
		if (personCountry == "DE" && personAge < 18) {
			customMessage = "Es tut uns leid";
		}
		if (personCountry == "JP" && personAge >= 20) {
			customMessage = "Kanpai";
		}
		if (personCountry == "JP" && personAge < 18) {
			customMessage = "Gomen'nasai";
		}
		if (personCountry == "MX" && personAge >= 18) {
			customMessage = "Salud";
		}
		if (personCountry == "MX" && personAge < 18) {
			customMessage = "Lo siento";
		}
		if (personCountry == "GB" && personAge >= 18) {
			customMessage = "Cheers";
		}
		if (personCountry == "GB" && personAge < 18) {
			customMessage = "Sorry";
		}

		if (personCountry.isEmpty() || personAge < 0 || personAge > 100) {
			System.out.println("Inaccurate user input");
		} else {
			System.out.println(customMessage);
		}
	}
}

