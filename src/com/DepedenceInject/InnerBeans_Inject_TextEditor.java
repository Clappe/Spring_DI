package com.DepedenceInject;

public class InnerBeans_Inject_TextEditor {
    private InnerBeans_Inject_SpellChecker innerBeans_inject_spellChecker;

    public void setInnerBeans_inject_spellChecker(InnerBeans_Inject_SpellChecker innerBeans_inject_spellChecker) {
        System.out.println("Inside setInnerBeans_Inject_SpellChecker!");
        this.innerBeans_inject_spellChecker = innerBeans_inject_spellChecker;
    }

    public void checkSpell(){
        innerBeans_inject_spellChecker.spellChecking();
    }
}
