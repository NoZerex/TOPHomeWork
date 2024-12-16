public class ThirdHM {
    public static void main(String[] args) {
        String[] password = new String[]{"MyPassword123", "offffff66", "oShlechtPass", "oaSdf3h", "oavalanche gt2020"};

        for (String pas : password) {
            String result = validatePassword(pas);
            if (result != null) {
                System.out.println(result);
            } else {
                System.out.println("Пароль " + pas + " соответствует всем требованиям.");
            }
        }
    }

    public static String validatePassword(String password) {
        StringBuilder issues = new StringBuilder();

        if (password.length() < 8 || password.length() > 20) {
            issues.append("должен быть длиной от 8 до 20 символов, ");
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpace = false;


        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isWhitespace(c)) {
                hasSpace = true;
            }
        }


        if (!hasUpperCase) {
            issues.append("должен содержать хотя бы одну заглавную букву, ");
        }


        if (!hasLowerCase) {
            issues.append("должен содержать хотя бы одну строчную букву, ");
        }


        if (!hasDigit) {
            issues.append("должен содержать хотя бы одну цифру, ");
        }


        if (hasSpace) {
            issues.append("не должен содержать пробелов, ");
        }


        if (!issues.isEmpty()) {
            issues.setLength(issues.length() - 2);
            return "Пароль " + password + " – " + issues;
        }

        return null;
    }
}