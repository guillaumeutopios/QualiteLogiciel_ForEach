### Installer Maven Manuellement

#### Pour Windows, macOS et Linux

1. **Télécharger Maven** :
   - Allez sur [Apache Maven](https://maven.apache.org/download.cgi) et téléchargez la version binaire ZIP ou TAR.GZ de Maven.

2. **Décompresser Maven** :
   - Décompressez le fichier téléchargé dans un répertoire de votre choix, par exemple `C:\Program Files\Apache\maven` sur Windows, ou `/usr/local/apache-maven` sur macOS/Linux.

3. **Configurer les Variables d'Environnement** :

   - **Windows** :
     - Ouvrez le Panneau de configuration > Système et sécurité > Système > Paramètres système avancés > Variables d'environnement.
     - Ajoutez une nouvelle variable d'utilisateur `M2_HOME` avec la valeur du répertoire où Maven a été décompressé, par exemple `C:\Program Files\Apache\maven`.
     - Ajoutez une nouvelle variable d'utilisateur `MAVEN_HOME` avec la même valeur.
     - Modifiez la variable `Path` et ajoutez `%M2_HOME%\bin`.

   - **macOS/Linux** :
     - Ouvrez le fichier `~/.bash_profile` ou `~/.bashrc` (ou `~/.zshrc` si vous utilisez zsh) avec un éditeur de texte et ajoutez les lignes suivantes :
       ```sh
       export M2_HOME=/usr/local/apache-maven
       export PATH=$M2_HOME/bin:$PATH
       ```
     - Rechargez le profil en exécutant `source ~/.bash_profile` ou `source ~/.bashrc`.

### Vérifier l'Installation de Maven

1. **Vérifier dans le Terminal ou l'Invite de Commande** :
   - Ouvrez un terminal ou une invite de commande.
   - Exécutez la commande suivante pour vérifier que Maven est correctement installé :
     ```sh
     mvn -version
     ```
   - Vous devriez voir la version de Maven et des informations sur votre système.


### Générer un Projet avec l'Archetype Cucumber

```sh
mvn archetype:generate -DarchetypeGroupId="io.cucumber" -DarchetypeArtifactId=cucumber-archetype -DarchetypeVersion="7.18.0" -DgroupId="com.example" -DartifactId="my-cucumber-project" -Dpackage="com.example" -Dversion="1.0.0-SNAPSHOT" -DinteractiveMode=false
```


[Suite du Tutoriel](https://cucumber.io/docs/guides/10-minute-tutorial/?lang=java)