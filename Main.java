/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		// System.out.println("====================================================");
		// System.out.println("HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		// System.out.println(tulsaRiot);
		tulsaRiot.teach();
		
		//int[] array = { 4, 5, 9, 2, 3, 6, 7 };

		//Bubble Sort
		// for (int j = 0; j < array.length; j++) {
		// 	for (int i = 0; i < (array.length - 1); i++) {
		// 		if (array[i] > array[i + 1]) {
		// 			int temp = array[i];
		// 			array[i] = array[i + 1];
		// 			array[i + 1] = temp;
		// 		}
		// 	}
		// }
		
		// for (int i = 0; i < array.length; i++) {
		// 	System.out.print(array[i] + "; ");
		// }

		// String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
		// 		tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		
		// RevisedEvent tulsaMassacre = new RevisedEvent(tulsaDescription, tulsaDay, tulsaRevised, tulsaCitation);
		
		// System.out.println("\n====================================================");
		// System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		//tulsaMassacre.teach();

		String RKDescription = "Rodney Glen King (April 2, 1965 - June 17, 2012) was an African-American man who was a victim of police brutality. On March 3, 1991, he was severely beaten by officers of the Los Angeles Police Department (LAPD) during his arrest after a high speed pursuit for driving while intoxicated on the I-210. An uninvolved resident, George Holliday, saw and filmed the incident from his nearby balcony and sent the footage, which showed Mr. King on the ground being beaten after initially evading arrest, to local news station KTLA. The incident was covered by news media around the world and caused a public uproar.";
		Date RKDay = new Date(3, 3, 1991);
		HistoricalEvent RKIncident = new HistoricalEvent(RKDescription, RKDay);

		RKIncident.teach();

		String RKRevisedDescription = "In March 1991, Rodney King led police officers from the California Highway Patrol, the Los Angeles Police Department and the Unified Police District in a high- speed pursuit. When King finally stopped his car 7.8 miles later, he was beaten with police batons as the officers allegedly attempted to get him to comply with their orders to lay down. A portion of this confrontation was captured on now famous videotape by a citizen who happened to be observing. A State trial against the officers for the excessive use of force resulted in acquittals, sparking deadly riots throughout the country. Subsequently, the officers were tried in Federal court for civil rights violations. This time two of the officers were found guilty. The officers' defense counsel alleges that the public was greatly misled about what really happened because of the distorted coverage by the media which continuously played the videotape. According to the author, the officers acted as they had been trained to do; what appeared on the video as a beating was actually an improperly executed and ineffective use of force. The author emphasizes the need for police agencies to have a realistic and clear use-of-force policy that considers nonlethal means of managing aggressive or resistant behavior and when deadly force is appropriate, and to have officer training that must incorporate this policy.";
		String RKCitation = "Citation Link: https://www.ojp.gov/ncjrs/virtual-library/abstracts/rodney-king-incident-gap-between-use-force-policy-and-training";

		RevisedEvent RKRevised = new RevisedEvent(RKDescription, RKDay, RKRevisedDescription, RKCitation);

		RKRevised.teach();

	}
}