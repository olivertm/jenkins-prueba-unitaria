pipeline {
    agent any

        stages {
 
            stage ('Test pruebas unitarias') {
                steps {
                    sh "mvn clean compile test"
                }
            }

            stage ('Compilamos aplicación') {
                steps {
                    sh "mvn -f pom.xml clean install -Dmaven.test.skip=true"   
                }
            }
  
            stage ('Hacemos pruebas funcionales') {
                steps {
                 echo "creando imagen"
                }

            }
            stage ('Mandamos a producción') {
                steps {
                 echo "creando imagen"
                }

            }
        }
}
