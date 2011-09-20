Feature: Name feature
        In order to ensure that domain name works
        As a Developer
        I want to run a quick Cuke4Duke test

        Scenario: MALE Name scenario
        	Given the Name Oscar
        	And the Gender MALE
        	Then we have 1 name
        	And existing name has 0 votes.
        	
        Scenario: FEMALE Name scenario
        	Given the Name Bea
        	And the Gender FEMALE
        	Then we have 1 name
        	And existing name has 0 votes.