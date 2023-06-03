public class S4Hw {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        // Для теста заполняем наш hashMap парами keyX : valueX, где X - порядковый номер от 0 до 24.
        for (int i = 0; i < 25; i++) {
            hashMap.put("key" + Integer.toString(i), "value" + Integer.toString(i));
        }
        System.out.println("Метод get по ключу \"key4\" возвращает: " + hashMap.get("key4"));
        System.out.println("Метод get по ключу \"key26\" возвращает: " + hashMap.get("key26"));
        System.out.println("Метод remove по ключу \"key4\" возвращает: " + hashMap.remove("key4"));
        System.out.println("Проверяем снова методом get ключ \"key4\": " + hashMap.get("key4"));
        System.out.println("Метод remove по ключу \"key26\" возвращает: " + hashMap.remove("key26"));
        System.out.println("Метод get по ключу \"key12\" возвращает: " + hashMap.get("key12"));
        System.out.println("Метод replace по ключу \"key12\" возвращает: " + hashMap.replace("key12", "newValue"));
        System.out.println("Проверяем снова методом get ключ \"key12\": " + hashMap.get("key12"));
        System.out.println("Метод sizeof возвращает: " + hashMap.sizeof());
        System.out.println("Метод containsKey по ключу \"key9\" возвращает: " + hashMap.containsKey("key9"));
        System.out.println("Метод containsKey по ключу \"key26\" возвращает: " + hashMap.containsKey("key26"));
        System.out.println("Метод containsValue по ключу \"key9\" возвращает: " + hashMap.containsValue("value9"));
        System.out.println("Метод containsValue по ключу \"key26\" возвращает: " + hashMap.containsValue("value26"));
    }
}