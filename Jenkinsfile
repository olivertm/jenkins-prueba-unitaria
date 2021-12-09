pipeline {
    agent { label 'master'}

        stages {
 
            stage ('test_pruebas_unitarias') {
                steps {
                    sh "mvn clean compile test_pruebas_unitarias"
                }
            }

            stage ('Compilamos_aplicación') {
                steps {
                    sh "mvn -f pom.xml clean install -Dmaven.test.skip=true"   
                }
            }
  
            stage ('Hacemos_pruebas_funcionales') {
                steps {
                 echo "creando imagen"
                }

            }
            stage ('Mandamos_a_producción') {
                steps {
                 echo "creando imagen"
                }

            }
        }
}
