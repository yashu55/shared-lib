
package com.demo

public class insideFunc{
    def hello(){
       pipeline {
		agent any

		stages {
			stage('wtrt') {
				steps {
					echo 'Hello dgdfgdfg'
				}
			}
			stage('dwetwtef') {
				steps {
					echo 'fggh'
				}
			}
			stage('hiwewetj') {
				steps {
					echo 'Hello'
				}
			}
		}
	}
    }
}