let adRequirements = () => {
    if (window.AdBridge && window.AdBridge.initializeAdTargeting) {
        return JSON.parse(AdBridge.initializeAdTargeting());
    }
    return {}
}
window.config = adRequirements();

let contentUrl = () => {
    if (window.AdBridge && window.AdBridge.fetchContentUrl) {
        return AdBridge.fetchContentUrl();
    }
    return null;
}

window.googletag = window.googletag || {};
window.googletag.cmd = window.googletag.cmd || [];
window.googletag.cmd.push(() => {
  let contentUrl = contentUrl();
  if (contentUrl) {
    window.googletag.pubads().set('page_url', contentUrl());
  }
});