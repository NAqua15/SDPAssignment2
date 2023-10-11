public enum Currency {
    USD, EUR, GBP; // Add more currencies as needed

    @Override
    public String toString() {
        switch (this) {
            case USD: return "US Dollar";
            case EUR: return "Euro";
            case GBP: return "British Pound";
            default: return "Unknown";
        }
    }
}

