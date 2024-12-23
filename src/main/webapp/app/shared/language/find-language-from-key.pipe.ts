import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  standalone: true,
  name: 'findLanguageFromKey',
})
export default class FindLanguageFromKeyPipe implements PipeTransform {
  private readonly languages: Record<string, { name: string; rtl?: boolean }> = {
    en: { name: 'English' },
    'zh-cn': { name: '中文（简体）' },
    'zh-tw': { name: '繁體中文' },
    // jhipster-needle-i18n-language-key-pipe - JHipster will add/remove languages in this object
  };

  transform(lang: string): string {
    return this.languages[lang].name;
  }
}
