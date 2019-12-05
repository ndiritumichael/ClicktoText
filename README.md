This is an android app developed in #KOtlin whose main aim is allow for texting a whatsapp number without necessarily saving the number.
The app is my first development in Kotlin for android and intoduces several basic concepts to beginners in Kotlin
i have used the Country code picker Library by hbb to select country codes and format phone numbers correctly: https://github.com/hbb20/CountryCodePickerProject
also used a gradle plugin imported in the app's build.gradle through "apply plugin: 'kotlin-android-extensions'" the extension allows for synthetic binding thereby removing the need to call "findviewbyid:
