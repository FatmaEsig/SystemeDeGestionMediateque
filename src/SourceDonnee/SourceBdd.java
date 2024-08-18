package SourceDonnee;
/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.util.ArrayList;
import java.util.List;


public class SourceBdd implements SourceDonneeStrategie{

    public static List<String[]> mediaList = new ArrayList<>();
    public static List<String[]> adherentList = new ArrayList<>();

    public static void loadBDD()
    {
        // loadMedia();
        //loadAdherents();
    }

    /**
     * Simule l'accès à une base de données SQL pour charger des livres et des vidéos
     *
     * @return Liste de chaînes de caractères avec le contenu des différentes colonnes
     */
    public List<String[]> loadMedia(){

        // Données pour les livres
        mediaList.add(new String[]{"1", "Pride and Prejudice", "Jane Austen", "1813", "35", "livre", "978-3-16-148410-0", "Romance", "Une histoire d’amour et de préjugés dans l’Angleterre du début du XIXe siècle, centrée sur Elizabeth Bennet et Mr. Darcy.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"2", "1984", "George Orwell", "1949", "21", "livre", "978-0-452-28423-4", "Dystopie", "Un futur totalitaire où Big Brother surveille chaque mouvement, et où la pensée indépendante est un crime.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"3", "Crime and Punishment", "Fyodor Dostoevsky", "1866", "27", "livre", "978-0-14-044913-6", "Philosophie", "L’histoire de Raskolnikov, un étudiant pauvre qui commet un meurtre et lutte avec sa conscience.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"4", "Hamlet", "William Shakespeare", "1603", "34", "livre", "978-0-7434-7712-3", "Tragédie", "Le prince Hamlet cherche à venger la mort de son père, le roi du Danemark, dans cette tragédie classique.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"5", "One Hundred Years of Solitude", "Gabriel García Márquez", "1967", "29", "livre", "978-0-06-088328-7", "Fiction", "La saga de la famille Buendía dans le village fictif de Macondo, explorant les thèmes de la solitude et du destin.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"6", "Anna Karenina", "Leo Tolstoy", "1877", "34", "livre", "978-0-14-303500-8", "Fiction", "Une histoire d’amour tragique entre Anna Karenina et le comte Vronsky, et les conséquences de leur liaison.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"7", "The Odyssey", "Homer", "1980", "35", "livre", "978-0-14-026886-7", "Mythologie", "Les aventures d’Ulysse alors qu’il tente de retourner chez lui après la guerre de Troie.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"8", "The Stranger", "Albert Camus", "1942", "34", "livre", "978-0-679-72020-1", "Philosophie", "Meursault, un homme indifférent, commet un meurtre et fait face à l’absurdité de la vie et de la justice.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"9", "The Brothers Karamazov", "Fyodor Dostoevsky", "1880", "13", "livre", "978-0-375-75942-7", "Fiction", "Une exploration profonde des questions de foi, de doute et de la nature humaine à travers l’histoire de la famille Karamazov.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"10", "Lolita", "Vladimir Nabokov", "1955", "20", "livre", "978-0-679-72316-5", "Controversé", "L’histoire troublante de la relation entre Humbert Humbert et la jeune Dolores Haze, surnommée Lolita.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"11", "Great Expectations", "Charles Dickens", "1861", "33", "livre", "978-0-14-143956-3", "Classique", "La vie de Pip, un orphelin, et ses aspirations à devenir un gentleman grâce à un mystérieux bienfaiteur.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"12", "The Old Man and the Sea", "Ernest Hemingway", "1952", "18", "livre", "978-0-684-80122-3", "Aventure", "Le combat épique d’un vieux pêcheur cubain contre un énorme marlin dans les eaux du Gulf Stream.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"13", "To Kill a Mockingbird", "Harper Lee", "1960", "21", "livre", "978-0-06-112008-4", "Drame", "Les défis de la justice et du racisme dans le Sud des États-Unis à travers les yeux de Scout Finch, une jeune fille.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"14", "The Great Gatsby", "F. Scott Fitzgerald", "1925", "18", "livre", "978-0-7432-7356-5", "Drame", "La vie mystérieuse et tragique de Jay Gatsby et son amour obsessionnel pour Daisy Buchanan dans les années 1920.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"15", "Moby-Dick", "Herman Melville", "1851", "32", "livre", "978-0-14-243724-7", "Aventure", "La quête obsessionnelle du capitaine Ahab pour capturer la baleine blanche Moby Dick.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"16", "War and Peace", "Leo Tolstoy", "1869", "12", "livre", "978-0-14-303999-0", "Historique", "Une épopée sur la vie de plusieurs familles aristocratiques russes pendant les guerres napoléoniennes.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"17", "The Catcher in the Rye", "J.D. Salinger", "1951", "18", "livre", "978-0-316-76948-8", "Drame", "Les aventures et réflexions de Holden Caulfield, un adolescent rebelle, à New York après avoir été expulsé de son école.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"18", "Brave New World", "Aldous Huxley", "1932", "26", "livre", "978-0-06-085052-4", "Dystopie", "Une vision dystopique d’un futur où la société est contrôlée par la technologie et la manipulation génétique.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"19", "The Divine Comedy", "Dante Alighieri", "1320", "33", "livre", "978-0-14-243722-3", "Épopée", "Le voyage de Dante à travers l’Enfer, le Purgatoire et le Paradis, guidé par le poète Virgile et Béatrice.", "", "", "", "", "", ""});
        mediaList.add(new String[]{"20", "The Hobbit", "J.R.R. Tolkien", "1937", "17", "livre", "978-0-618-00221-3", "Aventure", "Les aventures de Bilbo Baggins, un hobbit, qui se lance dans une quête pour récupérer un trésor gardé par le dragon Smaug.", "", "", "", "", "", ""});


        // Données pour les vidéos
        mediaList.add(new String[]{"21", "The Great Adventure", "John Smith", "2020", "28", "video", "", "", "", "120 minutes", "MP4", "1080p", "example.com/great-adventure", "1200", "Une aventure épique à travers des paysages magnifiques et des défis inattendus."});
        mediaList.add(new String[]{"22", "Cooking with Passion", "Emma Brown", "2019", "15", "video", "", "", "", "45 minutes", "MKV", "720p", "example.com/cooking-passion", "850", "Découvrez des recettes délicieuses et faciles à préparer avec Emma."});
        mediaList.add(new String[]{"23", "The Science of Everything", "Dr. Alan Green", "2021", "15", "video", "", "", "", "60 minutes", "AVI", "1080p", "example.com/science-everything", "2300", "Une exploration fascinante des principes scientifiques qui régissent notre monde."});
        mediaList.add(new String[]{"24", "Yoga for Beginners", "Sarah Lee", "2018", "16", "video", "", "", "", "30 minutes", "MP4", "720p", "example.com/yoga-beginners", "1500", "Une introduction douce et accessible au yoga pour les débutants."});
        mediaList.add(new String[]{"25", "History Uncovered", "Michael Johnson", "2022", "35", "video", "", "", "", "90 minutes", "MOV", "1080p", "example.com/history-uncovered", "1800", "Un voyage à travers les événements historiques les plus marquants."});
        mediaList.add(new String[]{"26", "Wildlife Wonders", "David Attenborough", "2020", "10", "video", "", "", "", "50 minutes", "MP4", "4K", "example.com/wildlife-wonders", "320", "Une immersion dans la beauté et la diversité de la faune sauvage."});
        mediaList.add(new String[]{"27", "The Art of Painting", "Lisa White", "2019", "31", "video", "", "", "", "40 minutes", "MKV", "1080p", "example.com/art-painting", "950", "Apprenez les techniques de peinture avec l’artiste Lisa White."});
        mediaList.add(new String[]{"28", "Fitness Challenge", "Mark Davis", "2021", "15", "video", "", "", "", "35 minutes", "MP4", "720p", "example.com/fitness-challenge", "1100", "Un programme de fitness intense pour vous mettre en forme rapidement."});
        mediaList.add(new String[]{"29", "Exploring Space", "Dr. Jane Foster", "2020", "14", "video", "", "", "", "70 minutes", "AVI", "1080p", "example.com/exploring-space", "2500", "Une exploration des mystères de l’univers et des découvertes spatiales."});
        mediaList.add(new String[]{"30", "Music Legends", "Tom Harris", "2018", "24", "video", "", "", "", "55 minutes", "MOV", "720p", "example.com/music-legends", "1700", "Un hommage aux plus grandes légendes de la musique à travers les âges."});
        mediaList.add(new String[]{"31", "Travel Diaries", "Anna Wilson", "2021", "35", "video", "", "", "", "65 minutes", "MP4", "1080p", "example.com/travel-diaries", "1900", "Découvrez des destinations exotiques et des cultures fascinantes avec Anna."});
        mediaList.add(new String[]{"32", "Tech Innovations", "Robert King", "2020", "27", "video", "", "", "", "50 minutes", "MKV", "1080p", "example.com/tech-innovations", "1250", "Les dernières innovations technologiques qui transforment notre monde."});
        mediaList.add(new String[]{"33", "Cooking Masterclass", "Gordon Ramsey", "2019", "32", "video", "", "", "", "60 minutes", "MP4", "720p", "example.com/cooking-masterclass", "2000", "Apprenez les techniques de cuisine avancées avec le chef Gordon Ramsey."});
        mediaList.add(new String[]{"34", "Mindfulness Meditation", "Emily Parker", "2018", "19", "video", "", "", "", "25 minutes", "AVI", "1080p", "example.com/mindfulness-meditation", "900", "Une séance de méditation guidée pour réduire le stress et augmenter la concentration."});
        mediaList.add(new String[]{"35", "Documentary Series", "Various", "2022", "14", "video", "", "", "", "120 minutes", "MP4", "4K", "example.com/documentary-series", "3500", "Une série documentaire sur des sujets divers allant de la science à la culture."});
        return mediaList;
    }

    /**
     * Simule l'accès à une liste d'adhérents
     *
     * @return Liste de chaînes de caractères avec le contenu des différentes colonnes
     */
    public List<String[]> loadAdherents() {

        adherentList.add(new String[]{"1", "Althea", "Haydon", "844 3rd Parkway", "9399913150", "14/01/1994"});
        adherentList.add(new String[]{"2", "Joshuah", "Stroud", "38 Ilene Point", "5735153680", "19/01/1971"});
        adherentList.add(new String[]{"3", "Forrest", "Yare", "38022 Truax Circle", "7674685194", "05/11/1981"});
        adherentList.add(new String[]{"4", "Salomo", "Pellamonuten", "8 Barnett Point", "6672401954", "15/06/1988"});
        adherentList.add(new String[]{"5", "Bordie", "Egle", "78 Roxbury Hill", "8774620546", "01/10/1981"});
        adherentList.add(new String[]{"6", "Germana", "Mcasparan", "361 New Castle Park", "4577880384", "24/02/1970"});
        adherentList.add(new String[]{"7", "Cris", "Tunaclift", "8395 Lindbergh Lane", "4759013347", "23/06/2007"});
        adherentList.add(new String[]{"8", "Laurena", "Atcock", "0550 Buhler Park", "6179307379", "23/04/1985"});
        adherentList.add(new String[]{"9", "Carolyn", "La Wille", "08 Eliot Road", "1549968872", "18/07/1981"});
        adherentList.add(new String[]{"10", "Ninnette", "Toy", "5051 Macpherson Park", "1366698486", "12/02/1970"});
        adherentList.add(new String[]{"11", "Inge", "Bazoche", "842 5th Avenue", "3712406703", "04/08/2000"});
        adherentList.add(new String[]{"12", "Tamma", "Trolley", "00 Fieldstone Point", "1714464827", "12/03/1985"});
        adherentList.add(new String[]{"13", "Rheta", "Pettipher", "7857 Nelson Lane", "5104841960", "21/05/1976"});
        adherentList.add(new String[]{"14", "Brennan", "Alexandrescu", "1 Sullivan Crossing", "2465930866", "01/05/2000"});
        adherentList.add(new String[]{"15", "Nappie", "Freeborne", "1800 Bellgrove Street", "1278247997", "22/08/2007"});
        adherentList.add(new String[]{"16", "Kelley", "Jordin", "5 Bellgrove Junction", "5523440552", "14/01/1984"});
        adherentList.add(new String[]{"17", "Euphemia", "Heinish", "0069 Monterey Parkway", "1204666788", "24/07/2003"});
        adherentList.add(new String[]{"18", "Pamelina", "Olive", "6260 Pepper Wood Terrace", "4319242365", "08/07/1984"});
        adherentList.add(new String[]{"19", "Midge", "Tuminini", "15 6th Circle", "2856169319", "15/08/2002"});
        adherentList.add(new String[]{"20", "Selie", "Killock", "990 2nd Center", "4748234299", "26/12/2001"});
        adherentList.add(new String[]{"21", "Donnie", "Anyon", "37 Anhalt Plaza", "4349612832", "02/11/1983"});
        adherentList.add(new String[]{"22", "Haleigh", "Petranek", "58986 Debs Pass", "7908897038", "27/06/1971"});
        adherentList.add(new String[]{"23", "Isabelita", "Cunnane", "92 Manitowish Street", "1323967976", "18/04/2008"});
        adherentList.add(new String[]{"24", "Matthaeus", "Dabourne", "95 Darwin Court", "4595101313", "24/05/1985"});
        adherentList.add(new String[]{"25", "Arlene", "Readwin", "46 Chive Pass", "3985461610", "01/09/2009"});
        return adherentList;
    }
}