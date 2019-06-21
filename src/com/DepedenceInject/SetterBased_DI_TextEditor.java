package com.DepedenceInject;

public class SetterBased_DI_TextEditor {
    private SetterBased_DI_SpellChecker setterBased_di_spellChecker;

    public void setSetterBased_di_spellChecker(SetterBased_DI_SpellChecker setterBased_di_spellChecker){
        System.out.println("Inside setSetterBased_DI_TextEditor ");
        this.setterBased_di_spellChecker = setterBased_di_spellChecker;
    }

    public SetterBased_DI_SpellChecker getSetterBased_di_spellChecker() {
        return setterBased_di_spellChecker;
    }

    public void spellCheck(){
        setterBased_di_spellChecker.checkSpelling();
    }
}
