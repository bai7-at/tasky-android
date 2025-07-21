(function() {
    var param = '%1$s';
    window.googletag = window.googletag || {};
    window.googletag.cmd = window.googletag.cmd || [];
    window.googletag.cmd.push(function() {
        window.updateAdTargeting(param);
    });
})();