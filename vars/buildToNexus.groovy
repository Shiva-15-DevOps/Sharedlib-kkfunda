def call() {

   stage('Build'){
     sh "mvn clean package sonar:sonar deploy"
     }
}
