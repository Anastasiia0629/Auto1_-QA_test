package common.test_data;

public enum Links {
        Auto1 ("https://www.autohero.com/de/search/");

        private final String searchPage;

        Links (String searchPage) {
            this.searchPage = searchPage;
        }

        public String getSearchPage() {
            return searchPage;
        }
    }

