// Binds Abra factory function to a global object that can be referenced from Kotlin code.
var AbraInterface = {
    getVariant: function(rules, params, overrides, nuke, testName) {
        var getVariant = Abra(JSON.parse(rules), JSON.parse(params), JSON.parse(overrides), nuke)
        return getVariant(testName)
    }
}