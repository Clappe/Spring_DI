package com.DepedenceInject;

public class ConstructorBased_DI_TextEditor {
    private ConstructorBased_DI_SpellChecker constructorBasedIDSpellChecker;

    public ConstructorBased_DI_TextEditor(ConstructorBased_DI_SpellChecker constructorBased_di_spellChecker){
        System.out.println("Inside ConstructorBased_DI_TextEditor Constructor!");
        this.constructorBasedIDSpellChecker = constructorBased_di_spellChecker;
    }

    public void spellCheck(){
        constructorBasedIDSpellChecker.checkspelling();
    }
}
