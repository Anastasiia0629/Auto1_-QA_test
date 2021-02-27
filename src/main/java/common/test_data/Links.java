package common.test_data;

public enum Links {
        Auto1 ("https://www.autohero.com/de/search/");

        private final String mainPage;

        Links (String mainPage) {
            this.mainPage = mainPage;
        }

        public String getMainPage() {
            return mainPage;
        }
    }

