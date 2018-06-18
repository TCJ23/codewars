public class ChgTab {
    public void chgTab1(int[] tab) {
        int[] nowa = {3, 6, 8};
        tab = nowa;
        showTab("W metodzie chTab1 tablica oznaczana przez tab", tab);
    }

    public void chgTab2(int[] tab) {
        for (int i = 0; i < tab.length; i++) tab[i] = tab[i]+2;
    }

    public void showTab(String s, int[] tab) {
        System.out.println(s);
        for (int i = 0; i < tab.length; i++) System.out.print(" " + tab[i]);
        System.out.println('\n');
    }

    public static void main(String[] args) {
        ChgTab chgTab = new ChgTab();
        int[] tab = {2, 5, 7};
        chgTab.chgTab1(tab);
        chgTab.showTab("Po wywołaniu metody chTab1 tablica oznaczana przez tab", tab);
        chgTab.chgTab2(tab);
        chgTab.showTab("Po wywołaniu metody chTab2 tablica oznaczana przez tab", tab);
    }
}
