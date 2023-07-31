


enum class AvailableLanguages {
    AR,
    EN;
}

expect fun getCurrentLanguage(): AvailableLanguages

expect fun getCurrentPlatform(): String

interface Localization {
    val appName: String
    val bookStadium: String
    val leagues: String
    val officials: String
    val posts: String

}

private object EnglishLocalization : Localization {
    override val appName = "Cap10"
    override val bookStadium = "Book Stadium"
    override val leagues = "Leagues"
    override val officials = "Officials"
    override val posts = "Posts"

}

private object ArabicLocalization : Localization {
    override val appName = "كابتن ١٠"
    override val bookStadium = "حجز ملعب"
    override val leagues = "البطولات"
    override val officials = "الرسميات"
    override val posts = "المنشورات"
}

fun getCurrentLocalization() = when (getCurrentLanguage()) {
    AvailableLanguages.EN -> EnglishLocalization
    AvailableLanguages.AR -> ArabicLocalization
}