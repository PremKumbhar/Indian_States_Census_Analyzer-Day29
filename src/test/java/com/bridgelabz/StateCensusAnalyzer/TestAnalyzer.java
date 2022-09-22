package com.bridgelabz.StateCensusAnalyzer;

import org.junit.jupiter.api.Test;

public class TestAnalyzer {
        @Test
        public void testCensusAnalyser() {
            StateCensusAnalyser analyser = new StateCensusAnalyser();
            analyser.loadData();
        }
    }

