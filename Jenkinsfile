try {
    timeout(time: 20, unit: 'MINUTES') {
        node('maven') {
            stage('mvn clean package') {
                checkout scm
                sh 'mvn clean package'
            }
            stage('build') {
                openshiftBuild(buildConfig: 'playground-api', showBuildLogs: 'true')
            }
            stage('deploy') {
                openshiftDeploy(deploymentConfig: 'playground-api')
            }
        }
    }
} catch (err) {
    echo "in catch block"
    echo "Caught: ${err}"
    currentBuild.result = 'FAILURE'
    throw err
}
