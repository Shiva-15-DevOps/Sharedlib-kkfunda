def call() {

   stage('Build'){
     sh "mvn clean package"
     }
  
  stage('SQ'){
    sh "mvn sonar:sonar"
  }
  
  stage('Nexus'){
    sh "mvn deploy"
  }
}
