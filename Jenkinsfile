node{
    stage("SCM checkout")
    {
        git credentialsId: 'git_credentials', url: 'https://github.com/imravi/cicd_test'
    }
    stage("Gradle package")
    {
        bat 'gradlew.bat clean assemble'
    }
    stage('Build Docker Image')
    {
        bat "docker build -t backbencher007/jenkins_test:0.0.1 ."
    }
    stage('Push to Docker container')
    {
        withCredentials([string(credentialsId: 'DockerHub_password', variable: 'Dockerhub_pass')]) {
            bat "docker login -u backbencher007 -p ${Dockerhub_pass}"
        }
        bat "docker push backbencher007/jenkins_test:0.0.1"
    }
}
